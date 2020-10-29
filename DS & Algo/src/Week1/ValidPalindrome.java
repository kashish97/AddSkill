package Week1;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String b = s.toLowerCase().trim();
        int start = 0;
        int end = b.length() - 1;

        while (start < end) {
            if(((b.charAt(start)>='a' && b.charAt(start)<='z') || ((b.charAt(start)>='0') && (b.charAt(start)<='9'))) || ((b.charAt(end)>='a' && b.charAt(end)<='z') || (b.charAt(end)>='0' && b.charAt(end)<='9'))){
                if(b.charAt(start)==b.charAt(end)){
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
            else if(!(b.charAt(start)>='a' && b.charAt(start)<='z') || (!(b.charAt(start)>='0') && b.charAt(start)<='9')){
                start++;
            }

            else if(!(b.charAt(end)>='a' && b.charAt(end)<='z') || !(b.charAt(end)>='0' && b.charAt(end)<='9')){
                end--;
            }
        }
        return true;
    }

    public static void main(String [] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s));
    }
}
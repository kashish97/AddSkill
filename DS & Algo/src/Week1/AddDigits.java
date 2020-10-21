package Week1;

public class AddDigits {

    public static int addDigits(int num) {

        if(num==0){
            //   return su
        }
        int sum=  num%10+addDigits(num/10);
        return sum;
    }



    public static void main(String [] args){
        System.out.print(addDigits(38));
    }

}
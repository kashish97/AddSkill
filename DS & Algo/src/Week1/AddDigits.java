package Week1;

public class AddDigits {

    public static int addDigits(int num) {

       if(num==0)
           return 0;
       return num%9==0?9:num%9;
    }

    public static void main(String [] args){
        System.out.print(addDigits(38));
    }

}
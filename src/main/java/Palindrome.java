public class Palindrome{

    public static void main(String[] args){

        int r;
        int sum = 0;
        int temp;
        int n = 454;

        temp = n;

        while (n > 0){

            r = n%10;
            sum = (sum * 10) + r;
            n = n/10;
        }

        if (temp == sum)
            System.out.println(temp + " is a palindrome");
        else
            System.out.println(temp + " is not a palindrome");
    }
}
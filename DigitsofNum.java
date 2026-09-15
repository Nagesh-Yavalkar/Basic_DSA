import java.util.Scanner;

public class DigitsofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = sc.nextInt();
        int digit = 0;
        int temp = n;
        while(temp!=0){
            temp/=10;
            digit++;

        }
        int div = (int)Math.pow(10, digit-1);
        while (div!=0) {
            int q = n/div;
            System.out.println(q);
            n=n%div;
            div = div/10;
            
        }


    }
}

import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n= sc.nextInt();
        int result = (n*(n+1))/2;
        System.out.println("The sum is : "+result);
        sc.close();
    }
}

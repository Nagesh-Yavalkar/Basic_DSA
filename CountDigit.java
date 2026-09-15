import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();
        int digit=0;
       
        
        while(num!=0){
            num = num/10;
            digit++;

        }

        System.out.println("Total Number of Digits : "+digit);

        
    }
}

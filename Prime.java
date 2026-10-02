import java.util.Scanner;

public class Prime {

    public static int countfactor(int num){
        int count =0;
        for(int i=2;i<=num/2;i++){  // counting factor between and 2 and half of the Number 
            if(num%i==0){
                count++;
            }
        }
        return count+2;   // +2 is for every number is divided by 1 and itself always
    }
    public static void isprime(int num){
        int r = countfactor(num);
        if(r==2){  // checking if count is equal to 2 then the number is prime 
            System.out.println("Given Number is Prime");
        }else{
            System.out.println("Given Number is Not Prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();
        isprime(num);

    }
}

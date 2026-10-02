import java.util.Scanner;

public class CountFactor {

    public static int countfactor(int num){
        int count = 0;
        for(int i=2;i<=num/2;i++){    // this loop checking factors from 2 to half of the number
            if(num%i==0){
                count++;
            }
        }
        return count+2;   //This two for 1 and number itself
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();
        int result = countfactor(num);
        System.out.println("Total Number of Count factor is : "+result);
    }
}




// logic : Every number is divided by 1 and itself due to count is +2. 
// and counting factor between 2 to half of the Number.
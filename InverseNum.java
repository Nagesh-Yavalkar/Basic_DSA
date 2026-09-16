import java.util.Scanner;

public class InverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();
        int inv = 0;
        int op = 1;
        while(num!=0){
            int od = num%10;
            int ip = od;
            int id = op;

            inv = inv+id*(int)Math.pow(10,ip-1);
            num/=10;
            op++;
        }
        System.out.println(inv);
    }
}

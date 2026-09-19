import java.util.Scanner;

public class RotateNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();    // given number
        System.out.println("Enter your roatation : ");
        int rot= sc.nextInt();    // Number of rotation.

        int temp = num;
        int count =0 ;
        while(temp>0){
            temp/=10;
            count++;           //how many digits in a given number
        }
        rot=rot%count;         // if user give high number of rotation then it convert it into minimum no.of rotation by taking remainder 
        if(rot<0){
            rot=rot+count;  //if user give negative roation then you have to convert it into positive rotation
        }

        int div =1;       //declare div and mul variable
        int mul = 1;
        for(int i=1;i<=count;i++){    
            if(i<=rot){
                div =div*10;     // increase diviser according to user rotation
            }
            else{
                mul = mul*10;   // remaining from the count-diviser = multiplication 
            }
        }
        int dividednum = num/div;  // here we find quetionant of a number eg 123 number and rotation is 1 then 12 is answer
        int multiplynum = num%div; // for above example in multiplynum save the remainder of number that is 3

        int k = multiplynum*mul+dividednum;   // in that expression multiply by multiplynum eg 3*100=300 and and the dividenum i.e 12 meanse ansewer is 312
        System.out.println(k);

    }
}

import java.util.Scanner;

public class Div{
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num%3==0){
            System.out.println("this number is divisible by 3");
        
        }
        else{
            System.out.println("this num is not divisible by 3");
        }
        
        
    }

}
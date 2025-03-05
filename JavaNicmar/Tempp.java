import java.util.Scanner;
class Tempp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the operater  +,-,*,/ ");
        char operator = scanner.next().charAt(0);
        int result=0;

        switch(operator){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;     
        }
        System.out.println("Result :" + result);
        scanner.close();
    }
    
}
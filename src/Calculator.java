import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter your first number: ");
        double num1=scanner.nextDouble();

        System.out.print("Enter your operation: ");
        char oper=scanner.next().charAt(0);

        System.out.print("Enter your second number: ");
        double num2=scanner.nextDouble();

        double result;

        switch (oper){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if (num2==0){
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result=num1/num2;
                break;
            default:
                System.out.println("Invalid Operator!");
                return;
        }
        System.out.println("Result: "+ result);
    }
}

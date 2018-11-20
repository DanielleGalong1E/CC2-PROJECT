package javaapplication4;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.println("Arithmetic Operator : ");
        String ArithmeticOperators = input.next();
        
        switch (ArithmeticOperators){
            case "+":
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case "add":
                System.out.println(num1 + "add" + num2 + "equals" + (num1 + num2));
                break;
            
            case "-":
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case "subtract":
                System.out.println(num1 + "subtract" + num2 + "equals" + (num1 - num2));
                break;
                
            case "*":
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case "multiply":
                System.out.println(num1 + "multiply" + num2 + "equals" + (num1 * num2));
                break;
                
            case "/":
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            case "divide":
                System.out.println(num1 + "divide" + num2 + "equals" + (num1 / num2));
                break;
            
            case "%":
                System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
                break;
            case "percentage":
                System.out.println(num1 + "percentage" + num2 + "equals" + (num1 % num2));
                break;
                
            default:
                System.out.println("Invalid");
                
        }
    
    }
}

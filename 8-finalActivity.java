package javaapplication16;
import java.util.Scanner;
public class finalActivity {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        facFib();          
    }
    
    static void facFib(){
        System.out.println("What do you want to get? Factorial / Fibonacci ?");
        String user = scan.nextLine();
        while ((!user.equals("fibonacci") && (!user.equals("factorial") && (!user.equals("factorial") && (!user.equals("fibonacci")))))){
            System.out.println("What do you want to get? Factorial / Fibonacci ?");
            user = scan.nextLine();
        }
        repeat(user);
    }
    static void repeat(String user){
        switch (user){
            case "factorial":
            case "Factorial": displayFac();
                break;
            case "fibonacci":
            case "Fibonacci": displayFib();
                break;
    }
    }
    
    static int[] input(){
        System.out.println("Enter number of elements:");
        int element = scan.nextInt();
        int [] num1 = new int [element];
        System.out.println("Enter " + element + " integer elements: ");
        for (int i = 0; i < element; i++){
                num1[i] = scan.nextInt();
        }
            return num1;
        }
    
    static int getFib (int n){
        if (n <= 1){
            return n;
        }else{
            return getFib(n-1) + getFib (n-2);
        }
    }
    
    static void displayFib(){
        int d[] = input();
        for (int x = 0; x < d.length; x++){
            System.out.println("f(" + d[x] + ")" + " =" + getFib(d[x]));
        } 
        
        System.out.print("\n");
    }
    
    static int getFac (int n){
        if (n <= 1){
            return n;
        }else{
            return n*getFac(n-1);
        }
    }
    
    static void displayFac(){
        int d[] = input();
        for (int x = 0; x < d.length; x++){
            System.out.println("f(" + d[x] + ")" + " =" + getFac(d[x]));
        } 
        System.out.print("\n");
    }    
}

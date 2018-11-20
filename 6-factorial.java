package javaapplication13;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        display();
    }
    static void display (){
        
        Scanner input = new Scanner (System.in);
        int x;
        
        System.out.println("Enter number:");
        x= input.nextInt();
        
        for (int d=0; d<=x; d++){
            System.out.print("f("+ d +")"+ "\t");
        }
       System.out.println("");
       
        for(int w=0; w<=x; w++){
        for (int num = 0; num<=w; num++){
            System.out.print(factorial(num) + "\t");
        }
            System.out.println("");
        }
    }
    static int factorial (int n){
        if (n<=1){
            return n;
        }
        else{
            return (factorial(n-1)+ factorial(n-2));
        }
    }
}

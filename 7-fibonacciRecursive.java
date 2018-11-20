package javaapplication15;
public class fibonacciRecursive {
    public static void main(String[] args) {

        int [] d = {3, 5, 7, 13, 2, 3, 9};
            display (d);
    }
    
    static void display (int []d){
        for (int i = 0; i < d. length ; i++){
                System.out.print("f("+ d[i] +")"+ "\t");
                System.out.print(fibonacci (d[i]));
                System.out.print("\n");
            }
        }
    
    static int fibonacci (int position){
        if (position == 0){
            return 0;
        }
        if (position == 1){
            return 1;
        }
        else{
            return fibonacci(position-1) + (position-2);
        }
    }
}

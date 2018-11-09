package javaapplication7;
public class JavaApplication7 {
    public static void main(String[] args) {
        
        int numbers[]={3, 9, 15, 20, 65, 23, 18, 4, 2, 14, 21};
        System.out.println("Array Values: ");
       
        for (int ctr = 0; ctr < numbers.length; ctr++){
            System.out.println(numbers[ctr]+" ");
            }
        System.out.println("\t");
        
        System.out.println("Even Numbers\tOdd Numbers");
        int oddNumbers[] = new int [6];
        int ctrOdd = 0;
        
        for(int ctr = 0; ctr < numbers.length; ctr++){
            if (numbers[ctr]%2 == 1){
                oddNumbers [ctrOdd] = numbers[ctr];
                ctrOdd++;
            }
        }
        int evenNumbers[] = new int [6];
        int ctrEven = 0;
        
        for(int ctr = 0; ctr < numbers.length; ctr++){
            if (numbers[ctr]%2 == 1){
                evenNumbers [ctrEven] = numbers[ctr];
                ctrEven++;
    }
        }
    }
}


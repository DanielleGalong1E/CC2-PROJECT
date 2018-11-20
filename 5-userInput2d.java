package javaapplication8;
import java.util.Scanner;
public class userInput2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
            int rows; 
            int columns;
                System.out.println("Enter number of rows: "); 
                    rows = sc.nextInt(); 
                System.out.println ("Enter number of columns: "); 
                    columns = sc.nextInt(); 
                    
            int [][] matrix = new int [rows] [columns]; 

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("row " + i + " column " + j + " : ");

                    matrix [i][j] = sc.nextInt();
                }
            }
                
            System.out.println ("Array:");
                int i;    
                for ( i = 0; i < rows; i++){
                    int j;
                    for ( j = 0; j < columns; j++){
                        System.out.print (matrix [i][j] + "\t");
                    }
                System.out.println();
                }
            }
        }

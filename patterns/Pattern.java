//This program is the basic pattern problem solving
//n = 5
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *

import java.util.Scanner; // Scanner

public class Pattern {
    //Static method to be called from static main method
    static void pattern1(int n){
      for(int i = 0; i < n; i++){ // Loop for Rows
        for(int j = 0; j < n; j++){ //Loop for columns and need to match the column with the row
          System.out.print("* ");
        }
        System.out.println(); //New line after each row
      }
    }
    //n = 5
    //* 
    //* *
    //* * *
    //* * * *
    //* * * * *
    //Static method to be called from static main method
    static void pattern2(int n){
      for(int i = 0; i < n; i++){ // Loop for Rows
        for(int j = 0; j < i+1; j++){ //Loop for columns and need to match the column with the row
          System.out.print("* ");
        }
        System.out.println(); //New line after each row
      }
    }
    //n = 5
    //1
    //1 2
    //1 2 3
    //1 2 3 5
    //1 2 3 4 5
    //Static method to be called from static main method
    static void pattern3(int n){
      for(int i = 0; i < n; i++){ // Loop for Rows
        for(int j = 0; j < i+1; j++){ //Loop for columns and need to match the column with the row
          System.out.print(j+1);
        }
        System.out.println(); //New line after each row
      }
    }
    //n = 5
    //1
    //2 2
    //3 3 3
    //4 4 4 4
    //5 5 5 5 5
    static void pattern4(int n){
      for(int i = 0; i < n; i++){ // Loop for Rows
        for(int j = 0; j < i+1; j++){ //Loop for columns and need to match the column with the row
          System.out.print(i+1);
        }
        System.out.println(); //New line after each row
      }
    }
    //n = 5
    //     *
    //    ***
    //   *****
    //  *******
    // ********* 
    static void pattern5(int n){
      for(int i = 0; i < n; i++){ // Loop for Rows
        for(int j = 0; j<n-i-1; j++){
          System.out.print(" ");
        }
        for(int k = 0; k < 2*i+1; k++){ //Loop for columns and need to match the column with the row
          System.out.print("*");
        }
        System.out.println(); //New line after each row
      }
    }
    //n = 5
    // *********
    //  *******
    //   *****
    //    ***
    //     * 
    static void pattern6(int n){
      for(int i = 0; i < n; i++){ // Loop for Rows
        for(int j = 0; j<i; j++){
          System.out.print(" ");
        }
        for(int k = 0; k < 2*n - 2 * i - 1; k++){ //Loop for columns and need to match the column with the row
          System.out.print("*");
        }
        for(int j = 0; j<i; j++){
          System.out.print(" ");
        }
        System.out.println(); //New line after each row
      }
    }
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    // *********
    //  ******* 
    //   *****  
    //    ***   
    //     *   
    static void pattern7(int n){
      for(int i = 0; i < n; i++){ // Loop for Rows
        for(int j = 0; j<i; j++){
          System.out.print(" ");
        }
        for(int k = 0; k < 2*n - 2 * i - 1; k++){ //Loop for columns and need to match the column with the row
          System.out.print("*");
        }
        for(int j = 0; j<i; j++){
          System.out.print(" ");
        }
        System.out.println(); //New line after each row
      }
    }
    /* *
     * **
     * ***
     * ****
     * *****
     * ****
     * ***
     * **
     * *
     */
    static void pattern8(int n){
      for(int i = 0; i < n; i++){ // Loop for Rows
        for(int k = 0; k < i+1; k++){ //Loop for columns and need to match the column with the row
          System.out.print("*");
        }
        System.out.println(); //New line after each row
      }
      for(int i = 0; i < n-1; i++){ // Loop for Rows
        for(int k = 0; k < n-i-1; k++){ //Loop for columns and need to match the column with the row
          System.out.print("*");
        }
        System.out.println(); //New line after each row
      }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        pattern8(n);
        sc.close(); //close scanner for safety
    }
}

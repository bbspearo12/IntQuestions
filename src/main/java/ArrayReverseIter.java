package main.java;

import java.util.Scanner;

public class ArrayReverseIter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n]; // declare a new array of size n
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i < n/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
           System.out.println(arr[i]);
        }
        for(int i=0; i <=n-1; i++) {
             System.out.print(arr[i]+ " ");
        }
    }
}



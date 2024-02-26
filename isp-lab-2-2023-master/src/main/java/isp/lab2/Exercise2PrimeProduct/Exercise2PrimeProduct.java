package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     * @param n
     * @param m
     * @return
     */
     
    public static long getPrimeProduct(int n, int m) {
        int p = 1; 
        while (n < m) {
            boolean ok = false;

            for(int i = 2; i <= n/2; ++i) {
                // condition for nonprime number
                if(n % i == 0) {
                    ok = true;
                    break;
                }
            }

            if (!ok && n != 0 && n != 1)
                p = p * n;

            ++n;
        }
        return p;
    }
        
    

    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    } 

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}

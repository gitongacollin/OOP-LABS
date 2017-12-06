/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.util.Scanner;
import operations.*;
/**
 *
 * @author HP
 */
public class Calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int f,s;
        System.out.println("Input first number");
        f=scanner.nextInt();
        System.out.println("Input second number");
        s = scanner.nextInt();
        
        Arithmethic arithmethic = new Arithmethic(f, s);
        Calculator calculator = new Calculator();
        int result = calculator.difference();
        System.out.println("The difference is:" + result);
        
        
    }
    
}

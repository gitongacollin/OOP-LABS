/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalessontesting;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class JavaLessonTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           checkAge(12);
        }catch(InvalidAgeException o){
            System.out.println(o.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
       
    }
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("You have not attained voting age");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
}

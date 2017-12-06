/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalessontesting;

/**
 *
 * @author HP
 */
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String customeMessage){
            super(customeMessage);
    }
}

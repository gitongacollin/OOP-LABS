/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author HP
 */
public class Arithmethic {
    private int first_number, second_number;
    public Arithmethic(){
        first_number = 10;
        second_number = 5;
    }
    public Arithmethic(int first, int second){
        this.first_number = first;
        this.second_number = second;
    }
    public int getFirst_number() {
        return first_number;
    }

    public int getSecond_number() {
        return second_number;
    }

    public void setFirst_number(int first_number) {
        this.first_number = first_number;
    }

    public void setSecond_number(int second_number) {
        this.second_number = second_number;
    }
    
    public int sum(){
        return (this.first_number + this.second_number);
    }
    public int difference(){
        return this.first_number - this.second_number;
    }
    public int product(){
        return first_number * second_number;
    }
    
}

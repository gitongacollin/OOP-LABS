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
public class Calculator extends Arithmethic {
    public int sub;
    @Override
    public int difference(){
        if(getFirst_number()>getSecond_number()){
            sub = getFirst_number()- getSecond_number();
            return sub;
        }
        return 0;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Elan Gabor
 */
import java.util.ArrayList;
public class Stack {
    
    private int list[];
    private int top;
    
    
    public Stack(){
        list = new int[100];
       top = 0;
    }//end
    
    public void push(int n){
        try{
        list[top] = n;
        top++;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stack Overflow");
        }
    }//end method
    
    public int pop(){
        try{
        int temp = list[top];
        list[top] = 0;
         top--;
         return(temp);
        }catch(ArrayIndexOutOfBoundsException e){
            top=0;
            System.out.println("Stack Underflow");
           return(top);
        }//end try catch
    }//end method
    
    public boolean isEmpty(){
        if(top > 0){
            return(true);
        }
        else{
            return(false);
        }
    }
    
    public int peek(){
        return(list[top]);
    }//end emthod
    
    
    
}//end class

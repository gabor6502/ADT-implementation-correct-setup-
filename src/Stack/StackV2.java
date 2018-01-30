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
public class StackV2 {
    
    private int top;
    private ArrayList list;
    
    public StackV2(){
        list = new ArrayList();
        top = 0;
    }//end constructor
    
    public void push(Object o){
        list.add(top, o);
        top++;
    }//end method
    
    public Object pop(){
        Object temp;
        try{
        temp = list.get(top-1);
        list.remove(top-1);
        top--;
        }catch (ArrayIndexOutOfBoundsException e){
            top = 0;
            temp = null;
        }//end try catch
        return(temp);
    }//end method
    
    public Object peek(){
        try{
        return(list.get(top-1));
        }catch(ArrayIndexOutOfBoundsException e){
            return(null);
        }//end try catch
    }//end method
    
    public boolean isEmpty(){
        if(top >=0)return(true); //end if
        else return(false);//end else
    }//end method
    
}//end class
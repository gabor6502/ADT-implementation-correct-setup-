/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Elan Gabor
 */
import java.util.ArrayList;
public class Queue {
    
    private ArrayList list;
    private int length;
    
    public Queue(){
 list =  new ArrayList();
 length = 0;
    }//end constructor
    
    
    //NEEDS TESTING
    public void enqueue(Object n){
        if(isEmpty()){
            list.add(n);
           // System.out.println("hey this works");
            //length++;
        }//end if
        //Try traversing the array backwards to move everything over
        else{
    for(int i =length-1; i > 0; i--){
        list.add(i+1,list.get(i));
    } //end for
    
    list.add(0,n);
        
        }//end else
        length++;
    }//end method
    
    public Object peek(){
        return(list.get(length-1));
    }
    
    public Object dequeue(){
        Object temp = "";
        temp = list.get(length-1);
        list.remove(length-1);
        
        length--;
        
        return(temp);
    }//end method
    
    public boolean isEmpty(){
        if(length <= 0){
            return(true);
        }//end if
        else{
            return(false);
        }//end else
    }//end method
}//end class
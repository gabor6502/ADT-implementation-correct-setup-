/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Elan Gabor
 */



public class Node extends Head{
    
    public enum LoadType{
        interger,decimal,string,obj
    }
 
    private Object payload;
    //private LoadType lt;
   
    
    public Node(Object pl){
        super();
        payload = pl;
        
      //  this.lt = lt;
    }//end
    
   
    public Object getLoad(){
        return(payload);
    }//end

}//end class
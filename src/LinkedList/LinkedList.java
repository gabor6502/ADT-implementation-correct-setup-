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
//NO RANDOM ACESS
//insert first and last method mean insrt to first of list or insert to last
//of list
//current.next means literaly set a current node then get the .next pointer
public class LinkedList {
    //used head like i should have done before
 //  private Node init; //initializing node, refrence to first node 
   private Node current;
   private Node previous;
   private int length;

   
   private Head h = new Head(); //the real init node
    public LinkedList(){
     //init = h.next; 
     previous = null;
     current = null;
     length = 0;
    }//end constructor
   
    public boolean isEmpty(){
        if(length <= 0){
            return(true);
        }
        else{
            return(false);
        }
    }//end method
    
//    //imsert metod for testing ::useless now delete soon
//    public void insertNext(Object payload){
//         Node n = new Node(payload);
//         if(isEmpty()){
//         h.next = n;
//         //System.out.println("If contacted, getting hash code\n"+n.toString());
//         }//end if
//         current = n;
//         length++;
//    }//end method
    
    public void insertFirst(Object payload){
        Node n = new Node(payload);
       
        if(isEmpty()){
         current = n;
         h.next = n;
        }//end if
        else{
            n.next= h.next;
            h.next = n;
            current = n;
            next(); //move up to next current
        }//end else
//        
//       // if(!isEmpty()){
//        h.next = n; //make the head's next pointer this new first element
//     //   }//end method
//        current = n;
        length++;
        //next();
    }//end method
    
    public void insertLast(Object payload){
        Node n = new Node(payload);
        //just a failsafe if the user tries to insert something to the last of 
        //a empty list
//        if(isEmpty()){
//         h.next = n;
//         System.out.println("If contacted, getting hash code\n"+h.next.toString());
//         }//end if
        current.next = n;
        next(); //move up to the new current
        length++;
      //  next();
    }//end method
     
    public void insertAfter(Object payload,Object key){
        Node after = linearSearch(key);
        
        if(after== null){
           //do nothing   
        }    
        else{
            
            Node n = new Node(payload);
            n.next = after.next;
            after.next = n;
            
        next();
        length++;
        }//end else
    }//end method
    
    
    //protoype of delete methods
    public Node delete(Object key){
       Node del = linearSearch(key);
       if(del==null){
           return(null);
           //do nothing
       }//end if
       else{
          //at this point the current is the node to be deleted
           previous.next = del.next;
           return(del);
       }//end else
       
    }//end method
    
    public Node deleteFirst(){
        Node del = h.next;
        
        if(isEmpty()){
            return(null);
        }//end if
        else{
            //make the next pointer in head point to the deleted/next's next
     h.next = h.next.next;
        
        return(del);
        }//end else
    }//end method
    
    //no random access so must be made private
    private void gotoLast(){
    //onece current.next is null, we know we;ve reached the last node
        while(current.next != null){
            previous = current;
            current = current.next;
        
        }//end loop
    }//end method
    
    public Node deleteLast(){
        gotoLast();
        if(current.next==null){
        Node del = current;
        //erases the last node(previous.next's pointer is set to null, thus previous becomes the last node)
        previous.next = null; 
        return(del);
        }//end if
        else{//else if something didnt work right in gotoLast
            return(null);
        }//end method

    }//end method
    
    //list traversal
    public void next(){

        previous = current;
        
        if(current.next != null){
          current = current.next;
         // System.out.println("current.next != null");
        }//end if
        else{
            current = h.next;
           // System.out.println("current = h.next");
        }//end else
      
    }//end method
   
    public Object getPayload(){
        return(current.getLoad());
    }//end method
    
    public String getStringLoad(){
        return(getPayload().toString());
    }//end method
    
    public Node linearSearch(Object key){
        previous = current; //previous node that was current can be waht ever it wants
        current = h.next; //reset current
        //Object temp;
        while(current.getLoad() != key){
              if(current == null){
                  return(null);
              }//end if
              else{
                  previous = current; //set the previous node (used in deletion)
                  current = current.next; //when current is found this wll be returned
              }  //esle
              
              
        }//end loop
        return(current);
        
        
    }//end method
}//end method

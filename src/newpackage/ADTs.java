/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Elan Gabor
 */
import Queue.Queue;
import Stack.StackV2;
import LinkedList.Node;
import LinkedList.LinkedList;
public class ADTs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      LinkedList ll = new LinkedList();
      String stest = "string test";
      String ntest = "next test";
      int itest = 6;
      int nitest = 148;
      
//TESTING THE STACK
      StackV2 s= new StackV2();
      
      System.out.println("--stack test--");
      
      s.push("first");
      s.push("second");
      s.push("third");
      
      //FILO data type, so ouput should be "third,second,first"
      
      System.out.println(s.peek().toString());
      s.pop();
      System.out.println(s.peek().toString());
      s.pop();
      System.out.println(s.peek().toString());
      
      //TESTING THE QUEUE
      Queue q = new Queue();
      
      System.out.println("--queue test--");
      
      q.enqueue("first");
      q.enqueue("second");
      q.enqueue("third");
      
      //FIFO data type, so output should be "first, second, third"
      
      System.out.println(q.peek().toString());
      q.dequeue();
      System.out.println(q.peek().toString());
      q.dequeue();
      System.out.println(q.peek().toString());
      q.dequeue();
      
//LINKED LIST TESTING- SHOULD TEST SEARCH AND ISEMPTY METHOD BUT IT SEEMS FINE FROM HERE
      //***BEGIN TESTING******
//      ll.insertNext(stest);
//      System.out.println(ll.getStringLoad());
//      ll.next();
//      ll.insertNext(ntest);
//      System.out.println(ll.getStringLoad());
//      
//      //only 2 nodes have been created, so should go back to head.next node
//      ll.next();
//      System.out.println(ll.getStringLoad());
//      ll.next();
//      System.out.println(ll.getStringLoad());
//      ll.next();
//      System.out.println(ll.getStringLoad());
      //*****TESTING THE INSERT FIRST AND LAST METHODS***
      
      //no matter what method i use, first or last insert, the current
      //gets stuck on the first element in list
      //next() method works in main but call it after node creation and the 
      //above problem occurs
//      
//      ll.insertFirst("first element");
//      System.out.println(ll.getStringLoad());
//   //   ll.next(); is not needed here
//      ll.insertLast("new last element");
//      System.out.println(ll.getStringLoad());
// //    ll.next(); //got to back to first
//     ll.insertFirst("new first element");
//     System.out.println(ll.getStringLoad());

     //***********TESTING THE NEXT() METHOD**********
    //************GENERAL TESTING METHODS**************
//       
//      ll.insertFirst("old first");
//      ll.insertLast("second");
//      ll.insertLast("third");
//      ll.insertFirst("new first");
//      
//      ll.insertAfter("inserted after the old first", "old first");
//      //roll over to first
//      ll.next();
//      ll.next();
//     // ll.next();
//     
//      
//       for(int i = 0; i < 5; i++){
//       ll.next();
//       System.out.println(ll.getStringLoad());
//      
//      }//end loop
//     
//      
//      Node del = ll.delete("old first");
//      
//      System.out.println("Node "+del+" was deleted and its payload |"+del.getLoad().toString()+"| is gone\n");
//      
//      for(int i = 0; i < 5; i++){
//      ll.next();
//      System.out.println(ll.getStringLoad());
//     
//     }//end loop
//      del = ll.delete("third");
//       System.out.println("Node "+del+" was deleted and its payload |"+del.getLoad().toString()+"| is gone\n");
//       
//      for(int i = 0; i < 5; i++){
//      ll.next();
//      System.out.println(ll.getStringLoad());
//     
//     }//end loop
//       
//      del = ll.deleteFirst();
//      System.out.println("Node "+del+" was deleted and its payload |"+del.getLoad().toString()+"| is gone\n");
//      for(int i = 0; i < 5; i++){
//      ll.next();
//      System.out.println(ll.getStringLoad());
//      }//end loop
//      
//      del = ll.deleteLast();
//      System.out.println("Node "+del+" was deleted and its payload |"+del.getLoad().toString()+"| is gone\n");
//      for(int i = 0; i < 5; i++){
//      ll.next();
//      System.out.println(ll.getStringLoad());
//      }//end loop
//      
    }//end main
}//end class
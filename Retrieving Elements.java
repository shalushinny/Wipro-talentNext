/*
Write a program to store a group of employee names into a HashSet, retrieve the elements one by
one using an Iterator.
**/

import java.util.*; 
public class IteratorDemo 
{ 
    public static void main(String args[]) 
    { 
        //create a Hashset to store strings 
        HashSet<String> hs = new HashSet<String>() ; 
  
        // store some string elements 
        hs.add("India"); 
        hs.add ("America"); 
        hs.add("Japan"); 
  
        // Add an Iterator to hs. 
        Iterator it = hs.iterator(); 
  
        // Display element by element using Iterator 
        while (it.hasNext()) 
            System.out.println(it.next()); 
    } 
} 

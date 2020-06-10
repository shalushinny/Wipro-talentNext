import java .io.*; 
  
class Array
{ 
static void sumexcludingrange(int li[], 
                              int a, int b) 
{ 
    int sum = 0; 
    boolean add = true; 
      
     
    for (int i = 0;  
             i < li.length; i++) 
    { 
       
        if (li[i] != a &&  
             add == true) 
            sum = sum + li[i]; 
              
         
        else if (li[i] == a) 
            add = false; 
        else if( li[i] == b) 
            add = true; 
    } 
      
    System.out.print(sum); 
} 
  

public static void main(String[] args) 
{ 
    int lis[] = {1, 2, 4, 5, 6}; 
    int a = 2; 
    int b = 5; 
      
    sumexcludingrange(lis, a, b); 
} 
} 

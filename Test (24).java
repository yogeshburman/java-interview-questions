// checking how many same elements present in array
import java.util.*;
class Test {
  
  public static void main (String[]args){
    
    int arr[] = {1,3,2,5,4,0,0,0,1};
    
    // sorting 
    Arrays.sort(arr);
    // checking multiple values
    
    int select= arr[0];
    int count=0;
    for(int i=0;i<arr.length;i++){
      
      if(select==arr[i]){
        count++;
      }
      else{
        System.out.println(" element " + select + " times present " + count);
        select=arr[i];
        count=1;
        
      }
    }
     System.out.println(" element " + select + " times present " + count);
  }
}
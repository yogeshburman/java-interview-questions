// print even and odd no. from array 

class Test {
  public static void main (String[]args){
    
    int arr[] ={1,2,3,4,5,6};
    int even_count=0;
    int odd_count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        even_count++;
        
      }
      else{
        odd_count++;
        
      }
      
    }
    System.out.println(even_count +  " even no. is present ");
    System.out.println(odd_count +  " odd no. is present ");
   
  }
}
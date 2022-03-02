// find max and min element in array 

class Test {
  public static void main (String[]args){
    
    int arr[]={1,2,3,4,5};
    
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
      
      if(max<arr[i]){
        max=arr[i];
      }
    }
    System.out.println(max + " is the largest no.");
    
    for(int i=0;i<arr.length;i++){
      
      if(min>arr[i]){
        min=arr[i];
      }
    }
    System.out.println(min + " is the smallest no.");
  }
}
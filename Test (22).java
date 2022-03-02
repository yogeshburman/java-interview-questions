// Searching element is present or noy 

class Test {
  public static void main (String[]args){
    
    int num=5;
    
    int arr[]={1,2,3,4,5};
    int count=0;
  
    for(int i=0;i<arr.length;i++){
      if(num==arr[i]){
        System.out.println(" Yes " + num + " is present in array");
        count++;
      }
      
    }
    if(count==0){
      System.out.println(num +" not present in array");
    }
  }
}
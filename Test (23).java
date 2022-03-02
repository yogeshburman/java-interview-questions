// sorting elements using bubble sort

class Test{
  public static void main (String[]args){
    
    int arr[]={1,4,2,6,3,0,0,1,2,4,1};
    
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.print("Sorted array = ");
    for(int value : arr){
      System.out.print(value);
    }
  }
}
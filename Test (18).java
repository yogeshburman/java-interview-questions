// checking arrays equal or not 

class Test {
  public static void main (String[]args){
    
    int arr[]={1,2,3,4,9};
    int arr1[]={1,2,3,4,9};
    int count=0;
    int count1=0;
    
    for(int i=0;i<arr.length;i++){
      if(arr[i]==arr1[i]){
        count++;
      }
      else{
        count1++;
      }
    }
    if(count1>0){
      System.out.println("not equal");
    }
    else{
      System.out.println("it is equal");
    }
  }
}
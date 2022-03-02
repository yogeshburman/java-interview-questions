// finding duplicate elements

class Test {
  public static void main (String[]args){
    
    int arr[]={1,2,3,4,5,12,11};
    boolean check = false;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        
        if(arr[i]==arr[j]){
          System.out.println("Found duplicate elenent " + arr[i]);
          check=false;
        }
        else{
          check=true;
        }
      }
    }
    if(check==true){
      System.out.println("not found duplicate elements");
    }
  }
}
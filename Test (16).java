// Sum of Array elements

class Test {
  public static void main (String[]args){
    
    int arr[]={1,2,3,4,5};
    int sum = 0;
    
    // using for each loop
    for(int value:arr){
      sum= sum +value;
    }
    
    System.out.println(sum);
  }
}
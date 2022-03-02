// Fibonacci series 


class Test {
  public static void main (String[]args){
    
    int a=0,b=1;
    int add=0;
    System.out.println("fibonacci series");
    // printing only 10 no.s
    for(int i=0;i<10;i++){
      add=a+b;
      System.out.print(add + " ");
      a=b;
      b=add;
    }
  }
}
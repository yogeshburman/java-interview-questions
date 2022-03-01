// Reverse a no. in java

class Test {
  public static void main (String[]args){
    
    int a = 123;
    System.out.println("Reverse a no " + a);
    
    // Reversing 
    int rev=0;
    
    while(a!=0){
    
    rev=rev*10 + a%10;  
    a = a/10;
    }
    System.out.println("Resversed " + rev);
    
    
  }
}
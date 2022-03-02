// Factorial of a no.

class Test {
  public static void main (String[]args){
    
    int num = 5;
    int fact=1;
    System.out.println("finding factorail of = " + num);
    
    for(int i=1;i<=num;i++){
      fact =fact*i;
    }
    System.out.println(" factorial of 5 is " + fact);
  }
}
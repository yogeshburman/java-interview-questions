// Sum of digits in a no.
class Test {
  public static void main (String[]args){
    
    int num = 1234 ;  // sum of its digits is 10
    int num1 = num;
    System.out.println("Sum of digits in a no.");
    int rem=0;
    int add=0;
    int check=0;
    while(num!=0){
      
      rem = num%10;
      add = add+rem;
      
      num=num/10;
    }
    System.out.println("Sum of " + num1 + " is " + add);
  }
}


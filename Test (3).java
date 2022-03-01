// Palindrome no. checking 
class Test {
  public static void main (String[]args){
    
    System.out.println("Checking Palindrome no.");
    System.out.println();
    
    int num = 11211;
    int check = num;
    int rev =0;
    
    // reversing no
    while(num!=0){
      
      rev = rev*10 + num%10;
      
      num=num/10;
      
    }
    // checking num and reverse is equal or not
    if(check==rev){
      System.out.println("it is a palindrome no.");
    }
    else{
      System.out.println("it is not a Palindrome no");
    }
  }
}

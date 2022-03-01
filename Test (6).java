// Palindrome string check
class Test {
  public static void main (String[]args){
    
    String str = "malayalam";
    
    System.out.println("Checking " +str+ " is Palindrome or not.....");
 
    char ch[]=str.toCharArray();
    int count = 0;
    int check , check1 ;
    for(int i=0;i<str.length()/2;i++){
         
         check= ch[i];
         check1= ch[str.length()-1-i];
         if(check==check1){
          count++;
           
         }
    }
    if(count==str.length()/2){
      System.out.println("Yes it is Palindrome no.");
    }
    else{
      System.out.println("it is not a palindrome no");
    }
    
  }
}
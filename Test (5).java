// Palindrome string 

class Test {
  public static void main (String[]args){
    
    String str = "malayalam";
    System.out.println("Checking string is Palindrome or not...");
    
    char ch []= str.toCharArray();
    // reevrsing string
    for(int i=0;i<str.length()/2;i++){
     char temp = ch[i];
     ch[i] = ch[ch.length-1-i];
     ch[ch.length-1-i] = temp;
    }
    // System.out.println(str.valueOf(ch));
    // System.out.println(str);
    if(str.equals(str.valueOf(ch))){
      
      System.out.println("It is a Palindrome String");
    }
    else{
      
      System.out.println("It is not a Palindrome String");
    }
  }
}
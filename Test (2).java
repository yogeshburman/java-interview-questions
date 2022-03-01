// Reverse a string 

class Test {
  public static void main (String[]args){
    
    String str = "proof";
    System.out.println("Reverse a string = " + str);
    
    // reversing 
    
    char ch[] = str.toCharArray();
    for(int i=0 ; i<ch.length/2;i++){
      char temp=ch[i];
      ch[i]=ch[ch.length-1-i];
      ch[ch.length-1-i]=temp;
    }
                                             // converting char to string
    System.out.println("Reversed String = " + String.valueOf(ch));
  }
}
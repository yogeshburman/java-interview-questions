// Given no. is prime or not 

class Test {
  public static void main (String[]args){
    
    int num=6;
    System.out.println("Checking " + num + " is Prime or not ");
    int count=0;
    for(int i=1;i<=num;i++){
      if(num%i==0){
        count++;
      }
    }
    if(count==2){
      System.out.println(num + " is Prime no.");
    }
    else{
      System.out.println(num + " is not a Prime no.");
    }
  }
}
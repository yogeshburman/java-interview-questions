// counting how manny digits in a no. 

class Test {
  public static void main (String[]args){
    int num=1234567;
    int check;
    int count=0;
    while(num!=0){
      check=num/10;
      num = check;
      count++;
    }
    System.out.println(count + " digits present in a no.");
  }
}
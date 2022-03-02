// generating random no. 

import java.util.Random;
class Test {
  public static void main (String[]args){
    
    Random rand = new Random();
    int random_no = rand.nextInt(100);
    System.out.println("Random integer no = " + random_no);
    
    float random_float = rand.nextFloat();
    System.out.println("Random float no = " + random_float);
    
    double random_double = rand.nextDouble();
     System.out.println("Random double no = " + random_double);
  }
}
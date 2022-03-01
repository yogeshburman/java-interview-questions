// checking how many even odd no. present in no. 

class Test {
    public static void main (String[]args){
        
        int num=1234;
        int rem;
        int evenCount=0;
        int oddCount=0;
        while(num!=0){
            rem=num%10;
            
            if(rem%2==0){
                evenCount++;
                
               // System.out.println(evenCount + " even no. is present");
            }
            else{
                oddCount++;
            }
            num=num/10;
        }
        System.out.println(evenCount + " even no. is present");
        System.out.println(oddCount + " odd no. is present");
    }
}
public class examplescodeninja {
    public static int countDigits(int n){
        int count = 0;
        int temp = n;
        while(temp>0){
            if(n%(temp%10) == 0){
                count++;
            }
            
            temp = temp/10;

        }
        return count;
    }

    public static int reverse(int x) {
        int reversedNumber = 0;
        while(x>0){
            reversedNumber = (reversedNumber * 10) + x%10;
            System.out.print("reversed Number"+reversedNumber);
            x = x/10;
        }
        return reversedNumber;
    }

    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        while(n>0){
            int pop = n%10;
            n = n/10;
            
            sum = sum + (int)Math.pow(pop,3);
            System.out.println("sum:"+sum+"\n n:"+n);
        }
        
        return sum == n;
    }
    public static int sumOfDivisors(int n) {
        // code here
        int sum = 0;
       for(int i = 1; i<=n;i++){
           sum = sum + i * (n/i);
           System.out.println("f(%d)"+i+"="+sum);
       }
       return sum;
    }

    public static void main(String[] args){
        System.out.println(sumOfDivisors(4));
    }
}
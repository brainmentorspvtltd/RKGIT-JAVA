public class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int copy = num;
        // Step 1 Count the Digit
        while(num!=0){
            num = num/10;
            count++;
        }
        // Step -2 Compute Power
        int pow = 1;
        while(count>1){
            pow = pow * 10;
            count--;
        }
       // System.out.println(pow);
       while(copy!=0){
        System.out.println(copy/pow);
        copy = copy % pow; // make number small
        pow = pow/10;
       }

    }
}

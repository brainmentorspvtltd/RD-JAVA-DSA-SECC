public class CountDigit {

    static int countDigit(int num){
        // Termination Case
        if(num == 0){
            
            return 0;
        }
        // Small Problem
        num = num/10; // Make Number Small
        int count = countDigit(num); // Recursion
        count = count + 1;
        return count;
}

    static void countDigit(int num, int count){
            // Termination Case
            if(num == 0){
                System.out.println("Count is "+count);
                return ;
            }
            // Small Problem
            num = num/10; // Make Number Small
            count = count + 1;
            countDigit(num, count); // Recursion
    }
    public static void main(String[] args) {
        int num = 12345;
        //countDigit(num, 0);
        System.out.println(countDigit(num));
    }
}

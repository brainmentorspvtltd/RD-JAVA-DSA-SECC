public class Return {
    // static int [] sum(int num, int count){
            
    // }
    static int countDigit(int num){
            // Termination Case
            if(num ==0){
                return 0;
            }
            // Small Problem + Cycle
            return countDigit(num/10) + 1;     
    }
    public static void main(String[] args) {
        int result = countDigit(12345);
        System.out.println(result); 
    }
}

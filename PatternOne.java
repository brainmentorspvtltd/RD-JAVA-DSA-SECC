public class PatternOne {
    static void star(int numberOfStar){
        if(numberOfStar==0){
            return ;
        }
        System.out.print("*");
        star(numberOfStar-1);
    }
    static void line(int numberOfLines){
        if(numberOfLines ==0){
            return ;
        }
        line(numberOfLines-1); // Cycle
        star(numberOfLines);
        System.out.println();
       
       
    }

    static void pattern(int numberOfLines){

        line(numberOfLines);
            // Line Print (5)
            // Star Print
    }
    public static void main(String[] args) {
        pattern(5);
    }
}

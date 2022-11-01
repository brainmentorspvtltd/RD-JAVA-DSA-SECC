public class PatternTwo {

    static void space(int numberOfSpace){
        if(numberOfSpace ==0){
            return ;
        }
        System.out.print(" ");
        space(numberOfSpace-1);
    }
    static void star(int numberOfStar){
        if(numberOfStar==0){
            return ;
        }
        System.out.print("*");
        star(numberOfStar-1);
    }
    static void line(int numberOfLines, int totalLines){
        if(numberOfLines ==0){
            return ;
        }
        
        line(numberOfLines-1,totalLines); // Cycle
        space(totalLines- numberOfLines);
        star(numberOfLines);
        System.out.println();
       
       
    }
    static void pattern(int numberOfLines){

        line(numberOfLines, numberOfLines);
            // Line Print (5)
            // Star Print
    }
    public static void main(String[] args) {
        pattern(5);
    }
}

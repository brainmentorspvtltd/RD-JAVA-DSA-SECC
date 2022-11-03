import java.util.ArrayList;
public class NArmStrong {
    static ArrayList<Integer> getAllArmStrong(int n, int i){
        if(i==n){
            return new ArrayList<Integer>();    
        }
       
        ArrayList<Integer> list  = getAllArmStrong(n , i+1);
        boolean result = isArmStrongNumber(i, i, 0);
        if(result){
            list.add(i);
        }
        return list;

    }
    static boolean isArmStrongNumber(int num, int org, int sum){
            if(num ==0){
                if(sum == org){
                    return true;
                }
                return false;
            }
            int digit = num%10;
            sum = sum+ digit * digit * digit;
            return isArmStrongNumber(num/10, org, sum);
    }
    public static void main(String[] args) {
       // max n 1000;
       ArrayList<Integer> list = getAllArmStrong(1000, 1);
       System.out.println(list);



    }
}

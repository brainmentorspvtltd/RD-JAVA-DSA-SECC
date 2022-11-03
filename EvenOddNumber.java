class EvenOddNumber{
    static int [] computeEvenOdd(int num, int count){
        if(num ==0){
            System.out.println("Count is "+count);
            return new int[2];
        }
        // Stack Build
        int arr[] = computeEvenOdd(num/10, count + 1);
        // Count Odd 
        if(count%2!=0){
            arr[0] = arr[0] + num % 10;
        }
        else{ // Even 
            arr[1] = arr[1] + num % 10;
        }
        return arr;
        // Whatever code i am going to write is comes in stack fall
    }
    public static void main(String[] args) {
        int arr[] = computeEvenOdd(723164,0);
        System.out.println("Odd Sum " + arr[0]);
        System.out.println("Even Sum "+arr[1]);
    }
}
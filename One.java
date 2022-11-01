class One{

    static void show(int count){
        // Base Case or Termination Case
        if(count == 10){
            return ; // exit from the function
        }
        System.out.println("Hello Java "+count);
        show(count+1);
    } // exit from the function
    public static void main(String[] args) {
        show(1);
    }
}
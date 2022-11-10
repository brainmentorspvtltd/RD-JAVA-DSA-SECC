import java.util.ArrayList;

public class SearchInArray {

    static ArrayList<Integer> search2(int arr[], int index, 
    int len, int searchElement){
        if(index == len){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ArrayList<Integer> list2 = search2(arr, index+1, len,searchElement);
        if(arr[index] == searchElement){
            list2.add(index);
        }
        return list2;
    }
    // //Org
    // static int [] search(int arr[], int index, 
    // int len, int searchElement){
    //     // Call Dup
    //     return  search(arr, 0, arr.length, 2, 0);
       
    // }
    static int currentIndex = 0;
    // Dup
    static int [] search(int arr[], int index, 
    int len, int searchElement){
        if(index == len){
            int list2[] = new int[len];
            return list2;
        }
        int list2[] = search(arr, index+1, len,searchElement);
        
        if(arr[index] == searchElement){
            System.out.println("Inside If ... "+searchElement);

            list2[currentIndex] = index;
            currentIndex++;
        }
        return list2;
    }
    public static void main(String[] args) {
      int arr[] = {1,2,4,5,6,2,7,2,8,9,2};
      int list[] = search(arr, 0, arr.length, 2);
        System.out.println(list);
        for(int e : list){
            System.out.print(e+" ");
        }
    } 
}

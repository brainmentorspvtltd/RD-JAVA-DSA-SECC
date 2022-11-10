import java.util.HashMap;

class Fr{

    static HashMap<Character, Integer> countChars(String str, int index, int len){
        if(index == len){
            HashMap<Character, Integer> map = new HashMap<>();
            return map;
        }
        HashMap<Character, Integer> map = countChars(str, index + 1 , len);
        if(map.get(str.charAt(index))== null){
                map.put(str.charAt(index), 1);
        }
        else{
            int count = map.get(str.charAt(index));
            map.put(str.charAt(index), count + 1);
        }
        return map;
    }
    public static void main(String[] args) {
        String name = "ram kumar";
        System.out.println(countChars(name, 0, name.length()));
        /* 
        String name = "ram kumar";
        HashMap<Character, Integer> map  = new HashMap<>();
        for(int i = 0; i<name.length(); i++){
            char singleChar = name.charAt(i);
            if(map.get(singleChar)==null){
                map.put(singleChar, 1);
            }
            else{
                int count = map.get(singleChar);
                map.put(singleChar, count+1);
            }

        }
        System.out.println(map);
        */
    }
}
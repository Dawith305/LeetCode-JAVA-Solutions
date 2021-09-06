import java.util.*;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();


        for(int k=0;k<s.length();k++){
            char c = s.charAt(k);
            if(hash.containsKey(c)){
                hash.put(c, hash.get(c) + 1);
            } else{
                hash.put(c,1);
            }
        }


        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            if(hash.get(c) == 1) return j;
        }



        return -1;

    }
}

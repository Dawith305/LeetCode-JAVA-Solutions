import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        //if there size is not the same
        if(s.length() != t.length()) return false;



        boolean is = false;
        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
        int sLeng = s.length();
        int tLeng = t.length();

        //put each character count in a map
        for(int k=0;k<sLeng;k++){
            char c = s.charAt(k);
            if(hash.containsKey(c)) hash.put(c, hash.get(c) + 1);
            else hash.put(c, 1);
        }

        //compare the number of character to the second string
        for(int j=0;j<tLeng;j++){
            char c = t.charAt(j);
            if(!hash.containsKey(c)){
                return false;
            }else if(hash.containsKey(c)){
                if(hash.get(c) > 0){
                    hash.put(c, hash.get(c) -1);
                    if(j == tLeng - 1) return true;
                }else{
                    return false;
                }
            }
        }


        return is;
    }
}

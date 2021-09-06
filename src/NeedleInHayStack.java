public class NeedleInHayStack {
    public int strStr(String haystack, String needle) {

        int n1 = haystack.length(), n2 = needle.length();

        //if needle if greater than haystack
        if(n2 > n1) return -1;
        if(n1 == 0 && n2 == 0) return 0;

        //the numbers of possible needles in the haystack
        int interval = n2 - n1;

        for(int k=0;k<interval;k++){
            //take the substring and compare to the needle
            if( haystack.substring(k,k+n2).equals(needle)) return k;
        }

        return -1;
    }
}

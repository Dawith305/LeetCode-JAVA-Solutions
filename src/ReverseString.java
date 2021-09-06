public class ReverseString {

    //using string builder input is a String
    public String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return  stringBuilder.reverse().toString();
    }

    //without string builder input are array of charsacters
    public void reverseString(char[] s) {
        int n = s.length;
        char[] reversed = new char[n];

        for(int j=0;j<n;j++){
            int newIndex = n-j;
            reversed[newIndex] = s[j];
        }

        System.arraycopy(reversed,0,s,0,n);
    }
}

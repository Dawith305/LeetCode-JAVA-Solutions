public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        //convert to lower case
        String st = s.toLowerCase();

        //replace all except alpha numeric characters
        st = st.replaceAll("[^a-zA-Z0-9]","");

        for(int k=0;k<st.length();k++){
            if(st.charAt(k) == st.charAt(st.length() - k)) continue;
            else return false;
        }

        return true;
    }
}

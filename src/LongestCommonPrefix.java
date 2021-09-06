public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length < 1) return "";

        //set the base prefix as the first string
        String prefix = strs[0];

        //loops through the string array
        for(int k=1;k<strs.length;k++){

            //if the prefix is not in the string remove the last charater till matched
            while(strs[k].indexOf(prefix) != 0){

                //removing last charater
                prefix = prefix.substring(0, prefix.length() - 1);

            }
        }


        return prefix;
    }
}

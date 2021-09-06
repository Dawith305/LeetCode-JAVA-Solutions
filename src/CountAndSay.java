public class CountAndSay {
    public String countAndSay(int n) {

        //if n is 0 or less
        if(n <= 0) return "";

        //final return string
        String res = "1";


        // till the number of time of the given number since the first res is in
        //we will avoid the 1 iteraction or last element
        while(n > 1){

            // start new builder to count and build string
            StringBuilder current = new StringBuilder();

            //loops through the string and count same items
            for(int i=0;i<res.length();i++){

                //1 count is guarenteed of the current item
                int count = 1;
                //increase count if the current and next indices are the same
                //next indice must not pass the last item
                while(i+1 < res.length() && (res.charAt(i) == res.charAt(i+1)) ){

                    //increase count increase the index since it's also counted
                    count++;
                    i++;

                }

                //append the count and the item
                current.append(count).append(res.charAt(i));
            }

            //add the new set of string
            res = current.toString();


            n--;
        }




        return res;
    }
}

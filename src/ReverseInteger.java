public class ReverseInteger {


    public int reverse(int x) {
        boolean isNeg = false;

        if(x<0){
            x *= -1;
            isNeg = true;
        }

        String s = Integer.toString(x);
        String[] st = s.split("");
        int reversed = 0;
        String reverseSt = "";
        int len = st.length;

        for(int k=0;k<len;k++){
            int newIndex = (len-1) - k;
            if(!(st[newIndex].equals("0") && (newIndex == len - 1)))
                reverseSt += st[newIndex];

        }

        try{
            reversed = reverseSt.equals("") ? 0 : Integer.parseInt(reverseSt);
        }catch(Exception e){

        }

        if(isNeg) reversed *= -1;


        return reversed;
    }
}

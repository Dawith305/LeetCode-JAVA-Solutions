public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int j=n-1;j>=0;j--){
            if(digits[j] != 9){
                digits[j]++;
                return digits;
            }else{
                digits[j] = 0;
                digits[j]++;
                return digits;
            }
        }

        //if [0] is provided return [1]
        if(digits[0] == 0){
            return new int[]{1};
        }

        return digits;
    }
}

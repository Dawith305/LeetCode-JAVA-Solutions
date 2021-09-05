public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int n = nums.length;

        //we will use to indices one for the zero one for the other numbers
        int reverseIndice =  n - 1;
        int normalIndice = 0;
        int[] newArray = new int[n];

        for(Integer num:nums){
            if(num == 0){
                newArray[reverseIndice] = num;
                reverseIndice--;
            }else{
                newArray[normalIndice] = num;
                normalIndice++;
            }
        }

        System.arraycopy(newArray,0,nums,0,n);
    }
}

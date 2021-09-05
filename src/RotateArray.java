public class RotateArray {

    public static void main(String[]args){
        int[] nums  = new int[]{1,2,3,4,5,6,7};
        System.out.println(rotate(nums,3));
    }

    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotated = new int[n];

        for(int j=0;j<n;j++){
            int newIndex = (j+k)%n;
            rotated[newIndex] = nums[j];
        }

        System.arraycopy(rotated,0,nums,0,n);

        return nums;
    }

}







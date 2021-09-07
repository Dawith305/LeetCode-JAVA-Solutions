public class MaximumSubArray {

    //contiguous sub array with max sum
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        if(n == 1) return nums[0];


        int max = nums[0];
        int current_sum = nums[0];

        for(int i=1;i<n;i++){
            current_sum = Math.max(current_sum+nums[i],nums[i]);
            max = Math.max(current_sum,max);
        }

        return max;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    //target sum here is 0
    public List<List<Integer>> threeSum(int[] nums) {

        //sort the arrays first
        Arrays.sort(nums);

        List<List<Integer>> output = new LinkedList();

        //iterate till we have two element left to the right to add and compare to the target
        for(int i = 0; i< nums.length - 2;i++){

            //continue if first element if not compare to previous element
            //to avoid duplicate item comparision
            if( i == 0 || (i>0 && nums[i] != nums[i-1])) {

                int left = i+1;
                int right = nums.length - 1;
                int sum = 0 - nums[i];

                while(left < right){
                    if(nums[left] + nums[right] == sum){
                        output.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(nums[left] + nums[right] > sum){
                        right--;
                    }else if(nums[left] + nums[right] < sum){
                        left++;
                    }

                }
            }
        }

        return output;
    }
}

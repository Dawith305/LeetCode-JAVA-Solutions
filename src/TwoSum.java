import java.util.HashMap;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        //put the nums here and their according index after visit
        HashMap<Integer,Integer> visited = new HashMap<>();

        for(int j=0;j<n;j++){
            int needed = target - nums[j];
            if(visited.containsKey(needed)){
                return new int[]{visited.get(needed), j};
            }
            visited.put(nums[j],j);
        }


        return new int[]{-1,-1};

    }
}

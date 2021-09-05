import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        boolean containsDuplicate = false;

        for(int j=0;j<nums.length;j++){

            if(hash.containsKey(nums[j])){
                hash.put(nums[j], hash.get(nums[j]) + 1);
            }else{
                hash.put(nums[j], 1);
            }
        }

        for(int k=0;k < nums.length;k++){
            if(hash.get(nums[k]) > 1) return true;
        }



        return containsDuplicate;
    }
}

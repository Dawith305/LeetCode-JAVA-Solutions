import java.util.*;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        //key is the number and value is the presence count
        Map<Integer,Integer> hash = new HashMap<>();
        int leng = nums.length;

        for(int j=0;j<leng;j++){
            if(hash.containsKey(nums[j])){
                hash.put(nums[j], hash.get(nums[j]) + 1);
            }else{
                hash.put(nums[j],1);
            }
        }

        for(Integer num: nums){
            //return the one occurring once
            if(hash.get(num) == 1) return num;
        }

        return -1;
    }
}

import java.util.*;


public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {

        //we assuming num2 is less that nums1 if not flip them
        if(nums2.length > nums1.length) return intersect(nums2,nums1);


        Map<Integer,Integer> hash = new HashMap<>();


        for(int j=0; j<nums1.length;j++){

            if(hash.containsKey(nums1[j])) hash.put(nums1[j], hash.get(nums1[j]) + 1);
            else hash.put(nums1[j], 1);

        }

        List<Integer> intersection = new ArrayList<>();

        for(int k=0;k<nums2.length;k++){

            int count = hash.getOrDefault(nums2[k],0);

            if(count > 0){
                intersection.add(nums2[k]);
                hash.put(nums2[k], hash.get(nums2[k]) - 1);
            }
        }


        int[] result = new int[intersection.size()];
        int count = 0;

        for(Integer i:intersection){
            result[count] = i;
            count++;
        }


        return result;


    }
}

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //create pinters p1,p2 and i to place the items
        int p1 = m-1, p2 = n-1, i = nums1.length - 1;

        //iterate till the the second array is done
        while(p2 >= 0){

            //compareing p1 and p2 also checking p1 is not out of index
            if(p1 >= 0 && nums1[p1] > nums2[p2]){

                //replace and decrement after operation
                nums1[i--] = nums1[p1--];

            }else{
                //replace and decrement after operation
                nums1[i--] = nums2[p2--];
            }


        }


    }
}

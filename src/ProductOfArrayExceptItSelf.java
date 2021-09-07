public class ProductOfArrayExceptItSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] product = new int[n];

        //first left element is 1
        left[0] = 1;

        //last right element is 1
        right[n - 1] = 1;


        //populate the left array
        for (int i = 1; i < n; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        //populating the right array
        for (int j = n - 2; j >= 0; j--) {
            right[j] = nums[j + 1] * right[j + 1];
        }

        //multiplying the two arrays
        for (int k = 0; k < n; k++) {
            product[k] = left[k] * right[k];
        }

        return product;
    }
}

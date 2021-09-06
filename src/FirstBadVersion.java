public class FirstBadVersion {

    public int firstBadVersion(int n) {

        //In the problem we'll use binary search using two pointer
        //to dismiss either half of the array that won't be the solution
        int left = 0, right = n;

        while(left < right){

            //formula to find middle of the list
            int middle = left + (right -left) / 2;

            //if the index is bad cut the right side from that index
            //by moving the right index to the new right i.e middle
            if(isBadVersion(middle)){
                right = middle;

                //if it's good cut the left side
            }else{
                left = middle + 1;
            }

        }

        return left;
    }

    //random api that return boolean
    private boolean isBadVersion(int middle) {
        return middle % 2 == 0;
    }
}

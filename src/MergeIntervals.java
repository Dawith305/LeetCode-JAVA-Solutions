import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;

        int n = intervals.length;

        //sort the arrays based on the interval start range
        Arrays.sort(intervals, (arr1,arr2)->Integer.compare(arr1[0],arr2[0]));

        List<int[]> output = new ArrayList<>();
        int[] curr_interval = intervals[0];

        //let add the first interval first
        output.add(curr_interval);

        //start comparing with the second interval
        for(int k=1;k<n;k++){
            int curr_start = curr_interval[0];
            int curr_end = curr_interval[1];
            int next_start = intervals[k][0];
            int next_end = intervals[k][1];


            if(curr_end >= next_start){
                curr_interval[1] = Math.max(curr_end,next_end);
            }else{
                curr_interval = intervals[k];
                output.add(curr_interval);
            }
        }


        return output.toArray(new int[output.size()][]);

    }
}

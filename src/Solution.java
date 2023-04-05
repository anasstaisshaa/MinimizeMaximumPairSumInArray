import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int[] arr =new int[nums.length/2];

        int i = 0;
        int j = nums.length-1;

        while(i < j){
            arr[i] = nums[i] + nums[j];
            i++;
            j--;
        }

        int max = 0;
        for(int k = 0; k < arr.length; k++){
            if(arr[k] > max)
                max = arr[k];
        }
        return max;
    }
}

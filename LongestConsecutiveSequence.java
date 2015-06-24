public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 1)
            return nums.length;
        
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] - nums[i] == 1){
                count++;
                max = Math.max(max, count);
            }
            
            else if(nums[i + 1] - nums[i] == 0){
                continue;
            }
            
            else{
                //max = Math.max(max, count);
                count = 1;
            }
        }
        return max;
    }
}
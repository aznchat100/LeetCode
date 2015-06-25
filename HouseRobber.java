public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
            
        if(nums.length == 1)
            return nums[0];
            
        int[] result = new int[nums.length];
        int max = 0;
        result[0] = nums[0];
        result[1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            //result[i] = nums[i];
            for(int j = 0; j < i - 1; j++){
                max = nums[i] + result[j];
                result[i] = Math.max(max, result[i]);
            }
        }
        
        for(int i = 0; i < nums.length; i++){
             max = Math.max(max, result[i]);
        }
        return max;
    }
}
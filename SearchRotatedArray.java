//If binarySearch(mid, end, nums, target); [1, 3] target = 2
/*
public class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low < high){
            int mid = (low + high)/2;
            if(nums[mid] > nums[high])
                low = mid + 1; //if low = mid [3, 1]
            else
                high = mid;// if high = mid + 1 [1, 3]
        }
        int rotation = low;
        low = 0; 
        high = nums.length - 1;
        if(nums[high] >= target && target >= nums[rotation] )
            return binarySearch(rotation, high, nums, target);
        else
            return binarySearch(0, rotation - 1, nums, target);
    }
    
    public int binarySearch(int start, int end, int[] nums, int target){
        if(start > end)
            return -1;
        int mid = (start + end) / 2;
        
        if(nums[mid] == target)
            return mid;
        
        if(nums[mid] > target)
            return binarySearch(start, mid - 1, nums, target);
        else
            return binarySearch(mid + 1, end, nums, target);
    }
}
*/
public class SearchRotatedArray{
        public int search(int[] A, int target) {
        // check if the target is in the sorted part, if so keep doing the binary search
        // otherwise throw away the sorted part and do the same on the other part of the array
        int start = 0;
        int end = A.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == target) return mid;
            if (A[start] <= A[mid]) {//this is the sorted part of the arrry check
                // situation 1, red line
                if (A[start] <= target && target <= A[mid]) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                // situation 2, green line
                if (A[mid] < target && target <= A[end]) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;      
    }
}
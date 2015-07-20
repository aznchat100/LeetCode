public class Solution {
    public List<List<Integer>> permute(int[] num) {
	    ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
	    permute(num, 0, result);
	    return result;
    }
 
    public void permute(int[] num, int start, List<List<Integer>> result) {
    
	    if (start == num.length) {
		    ArrayList<Integer> item = convertArrayToList(num);
		    result.add(item);
	    }
 
	    for (int j = start; j < num.length; j++) {
		    swap(num, start, j);
		    permute(num, start + 1, result);//permute the numbers after start which is the first index
		    swap(num, start, j);//this line is to move the swap array back to the original array
	    }
    }
 
    private ArrayList<Integer> convertArrayToList(int[] num) {
	    ArrayList<Integer> item = new ArrayList<Integer>();
	    for (int h = 0; h < num.length; h++) {
		    item.add(num[h]);
	    }
	    return item;
    }
 
    private void swap(int[] a, int i, int j) {
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
    }
}
public class Pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0)
            return result;
        
        ArrayList<Integer> subList = new ArrayList();
        subList.add(1);
        result.add(subList);
        return generate(1, numRows, subList, result);
    }
    
    public List<List<Integer>> generate(int n, int numRows, List<Integer> subList, List<List<Integer>> result) {
        if(n == numRows)
            return result;
            
       
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        for(int i = 0; i < subList.size() - 1; i++){
            temp.add(subList.get(i) + subList.get(i + 1));
        }
        temp.add(1);
        result.add(temp);
        return generate(n + 1, numRows, temp, result);
    }
}

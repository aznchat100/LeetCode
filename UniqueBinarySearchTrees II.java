/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        return generateTree(1,n+1);
    }

    private List<TreeNode> generateTree(int min, int max){
        List<TreeNode> list = new ArrayList<TreeNode>();
        // base case
        if(min == max){
            TreeNode node = null;
            list.add(node);
            return list;
        }
        // general case
        for(int i = min;i < max;i++){
            List<TreeNode> left = generateTree(min,i);
            List<TreeNode> right = generateTree(i+1,max);
            for(int p = 0;p < left.size();p++){
                for(int q = 0;q < right.size();q++){
                    TreeNode root = new TreeNode(i);
                    root.left = left.get(p);
                    root.right = right.get(q);
                    list.add(root);
                }
            }
        }
        return list;
    }
}
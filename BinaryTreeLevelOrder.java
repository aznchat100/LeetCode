public class BinaryTreeLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null) 
            return result;
            
        queue.add(root);
        while(!queue.isEmpty()){
            //int queue_size = queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i = 0; i < queue_size; i++){
                if(queue.peek().left != null)
                    queue.add(queue.peek().left);
                
                if(queue.peek().right != null)
                    queue.add(queue.peek().right); 
                    
                subList.add(queue.poll().val);
            }
            result.add(subList);
        }
        return result;
    }
}
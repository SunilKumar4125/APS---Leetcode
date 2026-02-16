class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //iterative

        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()){  //print  left  right   - print  right left 
            //pop current and add to ans
            TreeNode curr = st.pop();
            res.add(curr.val);

            //push right
            if (curr.right != null)
                st.push(curr.right);


            //push left
             if (curr.left != null)
                st.push(curr.left);
        }

        return res;
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null && q != null || p != null && q == null) return false;
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();
        stackP.add(p);
        stackQ.add(q);
    while (!stackP.isEmpty() && !stackQ.isEmpty()){
        TreeNode tempP = stackP.pop();
        TreeNode tempQ = stackQ.pop();
        if (tempP.val != tempQ.val) return false;
        if (tempP.left != null && tempQ != null) {
            stackP.push(tempP.left);
            stackQ.push(tempQ.left);
        }else if (tempP.left != null || tempQ.left !=null){
            return false;
        }
        if (tempP.right != null && tempQ.right != null) {
            stackP.push(tempP.right);
            stackQ.push(tempQ.right);
        } else if (tempP.right != null || tempQ.right != null) {
            return false;
        }
    }
    return true;
    }
    
}
     

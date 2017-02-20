package Salesforce;

public class LeftLeafSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(4);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.left.left = new TreeNode(1);

		LeftLeafSum i = new LeftLeafSum();
		System.out.println("Leaf sum : " + i.leftLeafSum(root));

	}

	private int leftLeafSum(TreeNode root) {
		int res = 0;
		if(root!=null){
			if(isLeaf(root.left)){
				res+=root.left.data;
			}else{
				res+=leftLeafSum(root.left);
			}
			res+=leftLeafSum(root.right);
		}
		return res;
	}
	
	private boolean isLeaf(TreeNode node){
		if(node==null){
			return false;
		}
		if(node.left==null && node.right==null){
			return true;
		}
		return false;
	}

}

class TreeNode {
	int data;
	TreeNode left, right;

	public TreeNode(int data) {
		this.data = data;
	}
}

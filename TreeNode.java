package Lab;

class TreeNode
{
int val;
TreeNode left;
TreeNode right;
	public TreeNode deleteNode(TreeNode root, int key)
	{
		if (root == null)
		{
			return root;
		}
//		find the target number to be eliminated
		if (root.val < key)
		{
			root.right = deleteNode(root.right, key);
			return root;
		} else if (root.val > key)
		{
			root.left = deleteNode(root.left, key);
			return root;
		}
//		None of the children or only one child
		if (root.left == null && root.right == null)
		{
			return null;
		} else if (root.left == null)
		{
			return root.right;
		} else if (root.right == null)
		{
			return root.left;
		}
		
		
//		Two of the children
		if (root.right.left == null)
		{
			root.right.left = root.left;
			return root.right;
		} else
		{
			TreeNode smallest = deleteSmallest(root.right);
			smallest.left = root.left;
			smallest.right = root.right;
			return smallest;
		}
	}
// Function for deleting Smallest from subtree
	private TreeNode deleteSmallest(TreeNode root)
	{
		TreeNode fir = root.left;
		TreeNode pre = root;
		while (fir.left != null)
		{
			pre = fir;
			fir = fir.left;
		}
		pre.left = fir.right;
		return fir;
	}
}

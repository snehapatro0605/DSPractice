package com.topic.tree;


public class CheckForBST
{
	Node root;
	Node prev = null;
	boolean isBST() {
		return isBSTUtil(root, Integer.MIN_VALUE,
							Integer.MAX_VALUE);
	}

	boolean isBSTUtil(Node node, int min, int max)
	{
		if (node == null)
			return true;

		if (node.data < min || node.data > max)
			return false;

		return (isBSTUtil(node.left, min, node.data-1) &&
				isBSTUtil(node.right, node.data+1, max));
	}

	public static void main(String args[])
	{
		CheckForBST tree = new CheckForBST();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);

		if (tree.isBST())
			System.out.println("IS BST");
		else
			System.out.println("Not a BST");
	}
	
	//Alternate Solution - Inorder traversal
	boolean isBSTAlt(Node root) {
		if(root != null) {
			if(!isBSTAlt(root.left)) {
				return false; // left traversal
			}
			
			if(prev != null && root.data <= prev.data) {
				return false;
			}  // process current node
			
			prev = root;
			
			return isBSTAlt(root.right); //right traversal;
		}
		return true;
	}
}

package com.topic.tree;

class Node
{
	int data;
	Node left, right;

	Node(int item)
	{
		data = item;
		left = right = null;
	}
}

public class HeightOfBinaryTree {

		Node root;
		int maxDepth(Node node)
		{
			if (node == null)
				return -1;
			
			int l = maxDepth(node.left);
			int r = maxDepth(node.right);
			
		return Math.max(l, r)+1;
		}
		
		public static void main(String[] args)
		{
			HeightOfBinaryTree tree = new HeightOfBinaryTree();

			tree.root = new Node(1);
			tree.root.left = new Node(2);
			tree.root.right = new Node(3);
			tree.root.left.left = new Node(4);
			tree.root.left.right = new Node(5);

			System.out.println("Height of tree is : " +
										tree.maxDepth(tree.root));
		}

}

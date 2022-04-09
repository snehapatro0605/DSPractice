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
			else
			{
				int lDepth = maxDepth(node.left);
				int rDepth = maxDepth(node.right);

				if (lDepth > rDepth)
					return (lDepth + 1);
				else
					return (rDepth + 1);
			}
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

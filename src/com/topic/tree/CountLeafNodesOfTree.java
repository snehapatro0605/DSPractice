package com.topic.tree;

public class CountLeafNodesOfTree {
	Node root;
	static int countLeafNodes(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}		
		return (countLeafNodes(root.left)+countLeafNodes(root.right));
	}
	public static void main(String[] args) {
		CountLeafNodesOfTree tree = new CountLeafNodesOfTree();

	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	tree.root.left.left = new Node(4);
	tree.root.left.right = new Node(5);
	System.out.println("Number of leaf node is : " +
			tree.countLeafNodes(tree.root));
	}
}

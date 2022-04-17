package com.topic.tree;

public class DiameterOfTree {
	Node root;
	static int diameter;
	static int getDiameter(Node node) {
		if(node == null) {
			return 0;
		}
		
		if(node.left == null && node.right == null) {
			return 1;
		}
		
		int lh = getDiameter(node.left);
		int rh = getDiameter(node.right);
		diameter = Math.max(diameter, lh+rh+1);
		
		return Math.max(lh, rh)+1;
	}
    public static void main(String args[])
    {
    	DiameterOfTree tree = new DiameterOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.getDiameter(tree.root);
        System.out.println(
            "The diameter of given binary tree is : "
            + tree.diameter);
    }
}

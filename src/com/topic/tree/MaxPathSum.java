package com.topic.tree;

public class MaxPathSum {
	Node root;
	static int max_sum;
	
	static int findMaxSum(Node node) {
		if(node == null) {
			return 0;
		}
		
		if(node.left == null && node.right == null) {
			return node.data;
		}
		
		int l = findMaxSum(node.left);
		int r = findMaxSum(node.right);
		
		int max_one = Math.max(node.data, node.data+ Math.max(l,r));
		int max_two = Math.max(max_one, node.data+l+r);
		max_sum = Math.max(max_sum, max_two);
		
		return max_one;
	}
    public static void main(String args[]) {
    	MaxPathSum tree = new MaxPathSum();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);
        tree.findMaxSum(tree.root);
        System.out.println("maximum path sum is : " +
                            tree.max_sum);
    }
}

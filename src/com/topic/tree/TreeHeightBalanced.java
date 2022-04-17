package com.topic.tree;

class Height{
	int height = 0;
}
public class TreeHeightBalanced {
	Node root;
	
	static int height(Node root) {
		if(root == null)
			return 0;		
		return 1+Math.max(height(root.left), height(root.right));
	}
	boolean isBalanced(Node root) {
		if(root == null)
			return true;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		return false;
	}
	
	static int isBalancedOptimized(Node root) {
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		int lh = isBalancedOptimized(root.left);
		int rh = isBalancedOptimized(root.right);
		
		if(lh == -1 || rh == -1 || Math.abs(lh-rh) >1)
			return -1;
		
		return Math.max(lh, rh)+1;
	}
	public static void main(String args[])
    {
		TreeHeightBalanced tree = new TreeHeightBalanced();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);
 
        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
        
        System.out.println("<---Optimized code--->"); 
        if(tree.isBalancedOptimized(tree.root) == 1) {
        	System.out.print("height balanced");       	
        }
        else {
        	System.out.print("Not height balanced"); 
        }
    }
}

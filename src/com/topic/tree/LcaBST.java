package com.topic.tree;

public class LcaBST {
Node root;
	static int lca(Node root,int n1,int n2) {

		if(root == null) {
			return 0;
		}
		
		if(root.data > n1 && root.data >n2) {
			return lca(root.left,n1,n2);
		}
		
		if(root.data <n1 && root.data <n2) {
			return lca(root.right,n1,n2);
		}
		
//		while(root != null) {
//			if(root.data <n1 && root.data < n2)
//				root = root.right;
//			else if(root.data >n1 && root.data > n2)
//				root = root.left;
//			else
//				break;
//		}	
		return root.data;
	}
	public static void main(String[] args) {
		LcaBST tree = new LcaBST();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("LCA: " +
				lca(tree.root,4,5));
		}

}

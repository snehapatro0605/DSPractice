package com.topic.tree;

import java.util.*;

public class LevelOrderTraversal {
	Node root;
	
	static void lvl(Node root){
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		q.add(new Node(0));
		while(!q.isEmpty()) {
			Node temp = q.poll();
			if(temp.data == 0) {
				if(q.isEmpty()) {
					return;
				}
				else {
					q.add(new Node(0));
					System.out.println();
					continue;
				}
			}
				System.out.print(temp.data+" ");
				
				if(null != temp.left)
					q.add(temp.left);
				if(null != temp.right)
					q.add(temp.right);
			}	
	}
	
	public static void main(String[] args)
	{
		LevelOrderTraversal tree = new LevelOrderTraversal();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		LevelOrderTraversal.lvl(tree.root);
	}
}

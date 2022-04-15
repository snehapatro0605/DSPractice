package com.topic.tree;

import java.util.*;

class Pair{
	int hd;
	Node node;
	Pair(int hd, Node node){
		this.hd=hd;
		this.node=node;
	}
}
public class VerticalOrderTraversal {
	Node root;
	static ArrayList<Integer> ver(Node root) {
		Queue<Pair> q = new ArrayDeque<>();
		Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
		q.add(new Pair(0,root));
		
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			if(map.containsKey(curr.hd)) {
				map.get(curr.hd).add(curr.node.data);
			}
			else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(curr.node.data);
				map.put(curr.hd, list);
			}
			
			if(null != curr.node.left) {
				q.add(new Pair(curr.hd-1,curr.node.left));
			}
			
			if(null != curr.node.right) {
				q.add(new Pair(curr.hd+1,curr.node.right));
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
			list.addAll(entry.getValue());
		}
		return list;
	}

	public static void main(String[] args) {
	VerticalOrderTraversal tree = new VerticalOrderTraversal();

	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	tree.root.left.left = new Node(4);
	tree.root.left.right = new Node(5);
	System.out.println("Vertical order traversal of tree is : " +
			tree.ver(tree.root));
	}

}

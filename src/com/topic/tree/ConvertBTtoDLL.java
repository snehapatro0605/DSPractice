package com.topic.tree;


public class ConvertBTtoDLL {
	Node root;
	Node head;
	Node prev = null;
	
	void btToDLL(Node root) {
		if(root == null)
			return;
		btToDLL(root.left); //Left Traversal
		
		if(prev == null) {
			head = root; //setting head
		}
		else {
			root.left = prev; //prev<--root
			prev.right = root;//prev-->root
		}
		prev = root; //prev ++;
		btToDLL(root.right); //Right traversal
	}
	
    void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
    
public static void main(String[] args) {
	
	ConvertBTtoDLL tree = new ConvertBTtoDLL();

	tree.root = new Node(10);
	tree.root.left = new Node(12);
	tree.root.right = new Node(15);
	tree.root.left.left = new Node(25);
	tree.root.left.right = new Node(30);
	tree.root.right.left = new Node(36);
	
	tree.btToDLL(tree.root);
	  
	tree.printList(tree.head);
}
}

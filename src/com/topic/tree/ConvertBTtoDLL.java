package com.topic.tree;


public class ConvertBTtoDLL {
Node root;
static Node prev = null;
static Node head;
static void convert(Node root) {
	if(root == null)
		return;
	convert(root.left);
	if(prev == null) {
		head = root;
	}
	else {
		root.left = prev;
		prev.right = root;
	}
	prev = root;
	convert(root.right);	
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
tree.convert(tree.root);
tree.printList(tree.head);
}
}

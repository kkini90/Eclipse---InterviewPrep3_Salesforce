package Salesforce;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.TreeMap;

public class VerticalOrder {
	public static TreeMap<Integer, ArrayList> treeMap = new TreeMap<>();
	public static int level;
	public ArrayList<Integer> list;

	public Node2 vertical(Node2 root, int level) {
		if (root == null) {
			return null;
		}
		Node2 y = vertical(root.left, --level);
		if (y == null) {
			level++;
		}
		if (treeMap.get(level) != null) {
			ArrayList x = treeMap.get(level);
			x.add(root.data);
			treeMap.put(level, x);
		} else {
			list = new ArrayList<>();
			list.add(root.data);
			treeMap.put(level, list);
		}
		return vertical(root.right, ++level);
	}

	public void printResult(TreeMap ht) {
		Set<Integer> i = ht.keySet();
		for (int keys : i) {
			System.out.println(ht.get(keys));
		}
	}

	public static void main(String args[]) {
		Node2 root = new Node2(1);
		root.left = new Node2(2);
		root.right = new Node2(3);
		root.left.left = new Node2(4);
		root.left.right = new Node2(5);
		root.right.left = new Node2(6);
		root.right.right = new Node2(7);

		VerticalOrder p = new VerticalOrder();
		p.vertical(root, 0);
		p.printResult(treeMap);

	}
}

class Node2 {
	int data;
	Node2 left;
	Node2 right;

	public Node2(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class ListNode {
	int data;
	ListNode next;

	public ListNode(int data) {
		this.data = data;
		next = null;
	}
}
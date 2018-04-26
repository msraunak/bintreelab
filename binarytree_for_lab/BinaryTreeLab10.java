package binarytree_for_lab;
/**
 * Binary Tree class. Represents a binary tree.
 * @author franceschi, raunak
 * @version 1.0 1/2/2017
 * 
 */
import java.util.*;

public class BinaryTreeLab10 {
	
	private BinaryTreeNode root;

	// default constructor
	public BinaryTreeLab10() {
		System.out.println("Creating a empty binary tree with root pointing to null");
		root = null;
	}
	
	// another constructor with simply the data value to create a root node
	public BinaryTreeLab10(int data) {
		System.out.println("Creating a binary tree with value " + data );
		root = new BinaryTreeNode (data);
	}
	
	// a third constructor with a given root node
	public BinaryTreeLab10(BinaryTreeNode nd) {
		System.out.println("Creating a binary tree with value " + nd.getData());
		root = nd;
	}

	// getter method
	public BinaryTreeNode getRoot() {
		return this.root;
	}
	
	/**
	 * Given a BinaryTree binTreeToBeAttached, attach it as the left child of this tree
	 * @param binTreeToBeAttacched the binary tree to be attached
	 */
	public void attachLeft(BinaryTreeLab10 binTreeToBeAttacched) {
		System.out.println("Attaching the BinaryTree with root value " + binTreeToBeAttacched.getRoot().getData() );
		root.setLeft( binTreeToBeAttacched.getRoot() );
	}

	/**
	 * Given a BinaryTree binTreeToBeAttached, attach it as the right child of the this tree
	 * @param binTreeTobeAttached the binary tree to be attached
	 */
	public void attachRight(BinaryTreeLab10 binTreeTobeAttached) {
		root.setRight(binTreeTobeAttached.getRoot());
	}
	

	/**
	 * A static method. Given two binary trees: left and right, 
	 * and a given value for a new BinartyTreeNode, construct a new binary tree
	 * using the value to construct a node and making the two trees as left 
	 * and right child of this tree
	 * @param leftTree the left child of the newly created binary tree
	 * @param rightTree the right child of the newly created binary tree 
	 * @param rootValue the value to be used for the root of the Binary tree
	 * @return
	 */
	public static BinaryTreeLab10 combine(BinaryTreeLab10 leftTree, 
										BinaryTreeLab10 rightTree, 
										int rootValue) {

		System.out.println("\n Creating a new Binary Tree by joining two others."
								+ " New root: " + rootValue);
		System.out.println("\t root of left tree: " + leftTree.getRoot().getData());
		System.out.println("\t root of right tree: " + rightTree.getRoot().getData());

		BinaryTreeLab10 newBinaryTree = new BinaryTreeLab10(rootValue);
		
		newBinaryTree.getRoot().setLeft(leftTree.getRoot());
		newBinaryTree.getRoot().setRight(rightTree.getRoot());
	
		return newBinaryTree;
	}
	
	/**
	 * In order traversal of the binary tree.
	 */
	public void inOrderTraversal() {
		System.out.print("In order traversal of the Binary Tree: ");
		inOrder(root);
		System.out.println();
	}

	/**
	 * A recursive method to walk the binary tree using "in order" traversal
	 * @param node the current root node of the binary tee you are traversing
	 */
	void inOrder(BinaryTreeNode node) {
		if (node != null) {
			inOrder(node.getLeft()); // a recursive call back to the method
			System.out.print(node.getData() + " "); // visit the node
			inOrder(node.getRight()); // a recursive call back to the method
		}
	}
	
	/**
	 * Pre order traversal
	 */
	public void preOrder() {
		System.out.print("Pre order traversal of the Binary Tree: ");
		preOrder(root);
		System.out.println();
	}

	/**
	 * Pre order traversal from a given node
	 * @param nd the node for which to perform the pre order traversal
	 */
	private void preOrder(BinaryTreeNode nd) {
		if (nd != null) {
			System.out.print(nd.getData() + " ");
			preOrder(nd.getLeft());
			preOrder(nd.getRight());
		}
	}

	/**
	 * Post order traversal
	 */
	public void postOrder() {
		System.out.print("Post order: ");
		postOrder(root);
		System.out.println();
	}
	
	/**
	 * The post order traversal of a binary tree from a given node
	 * @param node the node from which to start the post order traversal
	 */
	private void postOrder(BinaryTreeNode node) {
		// TODO IMPLEMENT for Lab 10
		return;
	}

	/**
	 * Counts and returns the number of nodes in a binary tree
	 * @return the size of the tree in terms of the number of nodes it has
	 */
	public int size() {
		return size(root);
	}

	/**
	 * A recursive algorithm that initially takes the reference of the root node
	 * and calculates the total number of nodes in it
	 * @param node the root of the current binary tree
	 * @return the size of the tree
	 */
	private int size(BinaryTreeNode node) {
		//TODO IMPLEMENT the size
		return -1;
		
	}

	/**
	 * Calculates the number of leaf nodes
	 * @return the number of leaf nodes in the whole binary tree 
	 */
	public int numOfLeafNodes() {
		return countLeaves(root);
	}

	/**
	 * A recursive method to compute the number of trees in a given (sub)tree 
	 * @param node the root node reference of the tree 
 	 * @return the number of nodes in that tree
	 */
	private int countLeaves( BinaryTreeNode node ) {
			// TODO To IMPLEMENT for lab 10
			return -1;
	}

	/**
	 * Finds out the leftmost of data value of the tree and returns it
	 * @return the data in the leftmost node. 
	 * @throws NoSuchElementException
	 */
	public int leftMostData() throws NoSuchElementException {
		//TODO Implement for lab10 
		return -1;
	}

	/**
	 * Computes the height of the Binary Tree
	 * @return the height of the binary tree
	 */
	public int height() {
		return height(root) - 1;
	}

	/**
	 * A recursive method to compute the height of the binary tree
	 * @param node the root node of the current binary tree that is being considered
	 * @return the height of the current binary three whose root node is provided 
	 */
	private int height(BinaryTreeNode node) {
		// TO IMPLEMENT for lab 10	
		return -1;
	}

	/**
	 * Walk through the binary tree to visit the levels from root to leaves
	 * and all nodes in each level one after another from left to right.
	 */
	public void levelTraversal() {
		System.out.print("Level traversal of the binary tree: ");
		if (root != null) {
			ArrayList<BinaryTreeNode> queue = new ArrayList<BinaryTreeNode>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryTreeNode nd = queue.remove(0); // guaranteed not null
				System.out.print(nd.getData() + " ");
				if (nd.getLeft() != null)
					queue.add(nd.getLeft());
				if (nd.getRight() != null)
					queue.add(nd.getRight());
			}
		}
		System.out.println();
	}
}
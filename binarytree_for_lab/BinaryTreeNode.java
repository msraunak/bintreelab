package binarytree_for_lab;
/**
 * Represents a node in a binary tree
 * @author Francheschi, Raunak
 * @version 1.0 1/2/2016
 */
public class BinaryTreeNode {
	
	/** */
	private int data;
	
	private BinaryTreeNode leftChild;
	private BinaryTreeNode rightChild;
	
	// default constructor
	public BinaryTreeNode() {
		this.data = 0;
		this.leftChild = null;
		this.rightChild = null;
	}
	// parameterized constructor
	public BinaryTreeNode (int value) {
		this.data = value;
		this.leftChild = null;
		this.rightChild = null;
	}
	// Another parameterized constructor
	public BinaryTreeNode (int value, BinaryTreeNode leftLink, BinaryTreeNode rightLink) {
		this.data = value;
		this.leftChild = leftLink;
		this.rightChild = rightLink;
	}
	
	// Getter Methods
	public int getData() {
		return this.data;
	}
	
	public BinaryTreeNode getLeft() {
		return this.leftChild;
	}
	
	public BinaryTreeNode getRight() {
		return this.rightChild;
	}

	// setter methods
	public void setLeft(BinaryTreeNode newLeft) {
		this.leftChild = newLeft;
	}
	
	public void setRight(BinaryTreeNode newRight) {
		this.rightChild = newRight;
	}
	
}

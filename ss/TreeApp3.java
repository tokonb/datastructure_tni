package ss;

public class TreeApp3 {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.createTree6();
		tree.printTree(tree.getRoot(), 0);
		
	//	System.out.println();
	//	tree.searchDeleteNode(14);
	//	System.out.println("Delete Node = " + tree.getDeleteNode().data);
	//	System.out.println("Parent = " + tree.getParent().data);
		System.out.println("-----------------------------------");
		
		int target = 25;
		tree.delete(target);
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("-----------------------------------");
		
		int target1 = 10;
		tree.delete(target1);
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("-----------------------------------");
		
		int target2 = 30;
		tree.delete(target2);
		tree.printTree(tree.getRoot(), 0);
		
		
		
		
		
		


	}

}

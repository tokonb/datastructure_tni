package ss;

public class TreeApp2 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree from createTree4()");
		System.out.println("------------------------------");
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree from createTree5()");
		System.out.println("------------------------------");
		BinaryTree tree1 = new BinaryTree();
		tree1.createTree5();
		tree1.printTree(tree1.getRoot(), 0);
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree from createTree6()");
		System.out.println("------------------------------");
		BinaryTree tree11 = new BinaryTree();
		tree11.createTree6();
		tree11.printTree(tree11.getRoot(), 0);


	}

}

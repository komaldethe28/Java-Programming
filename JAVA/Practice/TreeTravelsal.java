class Node{
	 char ele;
	Node left;
	Node right;

	Node(char ele){
		this.ele=ele;
	}
	
public void preOrder(Node root){
		if(root==null) return;
	System.out.print(root.ele+ " ");
	preOrder(root.left);
	preOrder(root.right);
	}

public void inOrder(Node root){
		if(root==null) return;
	inOrder(root.left);
	System.out.print(root.ele+ " ");
	inOrder(root.right);
	}	

public void postOrder(Node root){
		if(root==null) return;
	postOrder(root.left);
	postOrder(root.right);
	System.out.print(root.ele+ " ");
	}	
}

class TreeTravelsal{
public static void main(String [] args){
	Node root = new Node('A');
	root.left = new Node('B');
	root.right = new Node('C');
	root.left.left= new Node('D');
	root.left.right= new Node('E');
	root.right.left= new Node('F');
	root.right.right= new Node('G');
	
	System.out.println();
	System.out.print("Pre Order- ");
	root.preOrder(root);
	System.out.println();
	System.out.print("In Order- ");
	root.inOrder(root);
	System.out.println();
	System.out.print("Post Order- ");
	root.postOrder(root);
	}
}




















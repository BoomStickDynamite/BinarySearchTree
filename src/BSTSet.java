/**
 * Binary search tree
 * @author Grant Zukowski
 * @version 1 January 2016
 */
public class BSTSet implements StringSet_Minus {
	
	Node root;
	
	String theString = "";
	boolean contains = false;
	
	public BSTSet () {
		root = new Node(null);
	}
	
	
	@Override
	public boolean add(String s) {
		
		if (s == null) {
			throw new NullPointerException("the entry value is null");
		}
		
		if (root.value == null) {
			root.value = s;
			return true;
		} else {
			
			Node newNode = new Node(s);
			
			Node currentNode = root;
			
			Node parentNode;
			
			while (true) {
				
				parentNode = currentNode;
				
				if (s.compareTo(currentNode.value) == -1) {
					
					currentNode = currentNode.left;
					
					if (currentNode == null) {
						
						parentNode.left = newNode;
						return true;
					}
				} else {
					
					currentNode = currentNode.right;
					
					if (currentNode == null) {
						
						parentNode.right = newNode;
						return true;
					}
				}
			}
		}
	}
	
	
	@Override
	public void clear() {
		this.root.value = null;
		this.root.right = null;
		this.root.left  = null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(String s) {
		
		containsTraversal(root, s);
		
		return contains;
	}
	
	private void containsTraversal(Node root, String s) {
		if (root != null) {
			containsTraversal(root.left, s);
			if (root.value == s) {
				contains = true;
			}
			containsTraversal(root.right, s);
		}
	}

	@Override
	public boolean isEmpty() {
		if (this.root.value == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toStringInOrder() {
		theString = "";
		
		inOrderTraversal(root);
		
		return theString;
	}
	
	private void inOrderTraversal (Node root) {
		if (root != null) {
			theString += root.value;
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
			
		} 
	}

	@Override
	public String toStringPreOrder() {
		theString = "";
		
		preOrderTraversal(root);
		
		return theString;
	}
	
	private void preOrderTraversal (Node root) {
		if (root != null) {
			preOrderTraversal(root.left);
			theString += root.value;
			preOrderTraversal(root.right);
			
		} 
	}
	
	@Override
	public String toStringPostOrder() {
		theString = "";
		
		postOrderTraversal(root);
		
		return theString;
	}
	
	private void postOrderTraversal (Node root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			theString += root.value;
			
		} 
	}
	
	
	// helper method to check byte tree
    public void printSideways(Node root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.value);
            printSideways(root.left, level + 1);
        }
    }
	
	
}

class Node {
   String value;
   Node left, right;
   public Node(String s) {
      value = s;
      left = right = null;
   }
}
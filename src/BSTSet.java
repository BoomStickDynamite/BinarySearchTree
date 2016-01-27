/**
 * Binary search tree
 * @author Grant Zukowski
 * @version 1 January 2016
 */
public class BSTSet implements StringSet_Minus {
	
	Node root;
	 
	public BSTSet () {
		root = new Node(null);
	}
	
	
	@Override
	public boolean add(String s) {
		Node addedNode = new Node(s);
		if (s == null) {
			throw new NullPointerException("the entry value is null");
		}
		if (root.value == null) {
			root.value = s;
			return true;
		}
		if (root.value.compareTo(s) == 0) {
			return false;			
		} else if (root.value.compareTo(s) == -1) {
			root.left = addedNode;
			return true;
		} else if (root.value.compareTo(s) == 1) {
			root.right = addedNode;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(String s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toStringInOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toStringPreOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toStringPostOrder() {
		// TODO Auto-generated method stub
		return null;
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
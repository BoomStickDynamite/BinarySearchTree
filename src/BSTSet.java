
public class BSTSet implements StringSet_Minus {
	
	Node root;
	 
	public BSTSet () {
		
	}
	
	@Override
	public boolean add(String s) {
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
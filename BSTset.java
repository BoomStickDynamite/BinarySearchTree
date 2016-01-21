
/**
 * Binary Search Tree 
 * @author Owner
 *
 */
public class BSTset implements StringSet_Minus{
	public Node root;
	
	/**
	 * Public constructor that creates an empty tree
	 */
	public BSTset (){
		root.value = null;
		root.right = null;
		root.left  = null;
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

/**
 * Package private (no modifier)
 * 
 * 
 *
 */
class Node {
	String value;
	   Node left, right;
	   public Node(String s) {
	      value = s;
	      left = right = null;
	   }
	}
}
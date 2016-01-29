import static org.junit.Assert.*;

import org.junit.*;


public class StringSet_MinusTest {
	
	private BSTSet testCase;
	
	@Before
	public void setup(){
		 testCase = new BSTSet();
	}
	
	@Test
	public void testAdd() {
		assertTrue(testCase.add("b"));
		assertTrue(testCase.add("a"));
		assertTrue(testCase.add("d"));
		assertTrue(testCase.add("c"));
		assertTrue(testCase.add("f"));
	}
	

	@Test
	public void testInOrder(){
		testCase.add("b");
		testCase.add("a");
		testCase.add("c");
		testCase.printSideways(testCase.root, 0);
		assertEquals("bac", testCase.toStringInOrder());
		
	}
	
	@Test
	public void testPreOrder(){
		fillTree();
		assertEquals("abc", testCase.toStringPreOrder());
	}
	
	@Test
	public void testPostOrder(){
		fillTree();
		assertEquals("acb", testCase.toStringPostOrder());
	}

	@Test
	public void testContains() {
		fillTree();
		assertTrue(testCase.contains("a"));
	}
	
	@Test
	public void testFalseContains() {
		fillTree();
		assertFalse(testCase.contains("f"));
	}
	private void fillTree() {
		testCase.add("b");
		testCase.add("a");
		testCase.add("c");
	}
	@Test(expected = NullPointerException.class)
	public void testAddNull() {
		testCase.add(null);
	}

}

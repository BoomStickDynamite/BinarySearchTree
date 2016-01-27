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
		assertTrue(testCase.add("f"));
		assertTrue(testCase.add("g"));
		assertFalse(testCase.add("f"));
	}
	
	@Test(expected = NullPointerException.class)
	public void testAddNull() {
		testCase.add(null);
	}

}

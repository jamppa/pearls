import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchBasicTest {

	private BinarySearch binarySearch;
	
	@Before
	public void setUp() {
		binarySearch = new BinarySearch(Arrays.asList(10, 20, 30));
	}
	
	@Test
	public void shouldFindPositionForLowestNumber() {
		System.out.println(1/2);
		int pos = binarySearch.search(10);
		assertEquals(0, pos);
	}
	
	@Test
	public void shouldFindPositionForMiddleNumber() {
		int pos = binarySearch.search(20);
		assertEquals(1, pos);
	}
	
	@Test
	public void shouldFindPositionForHighestNumber() {
		int pos = binarySearch.search(30);
		assertEquals(2, pos);
	}
	
	@Test
	public void shouldNotFindPositionForNonExistingNumber() {
		int pos = binarySearch.search(666);
		assertEquals(-1, pos);
	}
	
}

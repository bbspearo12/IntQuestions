package main.test;
import main.java.ArrayReverse;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayReverseTest {

	@Test
	public void reverseTest() {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		ArrayReverse.reverse(numbers);
		assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, numbers);
	}
}

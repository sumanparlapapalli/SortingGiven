package test.java;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	@Before
	public void setUp() throws Exception {
	}
 // If the array is null
	@Test(expected = NullPointerException.class)
	public void test() {
		Item[] i1 = null;
		SortAlgos.bubbleSort(i1);

	}
	
	// test case for edge and node coverage at for loop
	@Test
	public void SingleElememt() {
		Item i1 = new Item(10);
		Item unsort[]  = {i1};
		Item sort [] = {i1};
		assertEquals(Arrays.toString(sort),Arrays.toString(SortAlgos.bubbleSort(unsort)));

	}
	
	//test case for edge coverage at if condition
	@Test
	public void ifConditionBubbleSort() {
		Item i1 = new Item(10);
		Item i2 = new Item(20);
		Item i3 = new Item(30);
		Item i4 = new Item(40);
		Item i5 = new Item(50);
		Item unsort[]  = {i1,i2,i3,i4,i5};
		Item sort [] = {i1, i2,i3, i4, i5};
		assertEquals(Arrays.toString(sort),Arrays.toString(SortAlgos.bubbleSort(unsort)));

	}
	// test case for condition coverage which will be true 
	@Test
	public void test1() {
		Item i1 = new Item(10);
		Item i2 = new Item(20);
		Item i3 = new Item(70);
		Item i4 = new Item(40);
		Item i5 = new Item(30);
		Item unsort[]  = {i1,i2,i3,i4,i5};
		Item sort [] = {i1, i2,i5, i4, i3};
		assertEquals(Arrays.toString(sort),Arrays.toString(SortAlgos.bubbleSort(unsort)));

	}
	@Test
	public void testss() {
		Item i1 = new Item(10);
		Item i2 = new Item(20);
		Item i3 = new Item(70);
		Item i4 = new Item(40);
		Item i5 = new Item(30);
		Item unsort[]  = {i1,i2,i3,i4,i5};
		Item sort [] = {i1, i2,i5, i4, i3};
		assertEquals(Arrays.toString(sort),Arrays.toString(SortAlgos.selectionSort(unsort)));

	}
	@Test
	public void testis() {
		Item i1 = new Item(10);
		Item i2 = new Item(20);
		Item i3 = new Item(70);
		Item i4 = new Item(40);
		Item i5 = new Item(30);
		Item unsort[]  = {i1,i2,i3,i4,i5};
		Item sort [] = {i1, i2,i5, i4, i3};
		assertEquals(Arrays.toString(sort),Arrays.toString(SortAlgos.insertionSort(unsort)));

	}
	@Test
	public void testms() {
		Item i1 = new Item(10);
		Item i2 = new Item(20);
		Item i3 = new Item(70);
		Item i4 = new Item(40);
		Item i5 = new Item(30);
		Item unsort[]  = {i1,i2,i3,i4,i5};
		Item sort [] = {i1, i2,i5, i4, i3};
		assertEquals(Arrays.toString(sort),Arrays.toString(SortAlgos.mergeSort(unsort)));

	}
	@Test
	public void testqs() {
		Item i1 = new Item(10);
		Item i2 = new Item(20);
		Item i3 = new Item(70);
		Item i4 = new Item(40);
		Item i5 = new Item(30);
		Item unsort[]  = {i1,i2,i3,i4,i5};
		Item sort [] = {i1, i2,i5, i4, i3};
		assertEquals(Arrays.toString(sort),Arrays.toString(SortAlgos.quickSort(unsort)));

	}
	@Test
	public void tesths() {
		Item i1 = new Item(10);
		Item i2 = new Item(20);
		Item i3 = new Item(70);
		Item i4 = new Item(40);
		Item i5 = new Item(30);
		Item unsort[]  = {i1,i2,i3,i4,i5};
		Item sort [] = {i1, i2,i5, i4, i3};
		assertEquals(Arrays.toString(sort),Arrays.toString(SortAlgos.heapSort(unsort)));

	}




}



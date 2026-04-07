package murraco;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

public class Group15Test {

  @Test
  public void testBubbleSortEmpty() {
    final Integer[] data = {};
    BubbleSort.bubbleSort(data);
    assertEquals("[]", Arrays.toString(data));
  }

  @Test
  public void testInsertionSortSingle() {
    final Integer[] data = {1};
    InsertionSort.insertionSort(data);
    assertEquals("[1]", Arrays.toString(data));
  }

  @Test
  public void testSelectionSortReverseSorted() {
    final Integer[] data = {5, 4, 3, 2, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
  }

  @Test
  public void testBubbleSortAlreadySorted() {
    final Integer[] data = {1, 2, 3, 4, 5};
    BubbleSort.bubbleSort(data);
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
  }

  @Test
  public void testQuickSortNegative() {
    final Integer[] data = {-5, -1, -10, 0, 3};
    Quicksort.quickSort(data);
    assertEquals("[-10, -5, -1, 0, 3]", Arrays.toString(data));
  }

  @Test
  public void testAllIdenticalValues() {
    final Integer[] data = {5, 5, 5, 5, 5};
    Quicksort.quickSort(data);
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(data));
  }

  @Test
  public void testDuplicateValues() {
    final Integer[] data = {3, 1, 2, 3, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[1, 1, 2, 3, 3]", Arrays.toString(data));
  }


  @Test
  public void testMergeSortRightSideExhaustion() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1,78,31,54,2,-5,9};
    MergeSort.mergeSort(data);
    assertEquals("[-5, 0, 1, 2, 3, 4, 5, 7, 9, 11, 12, 15, 31, 54, 78, 99]", Arrays.toString(data));
  }

  @Test
  public void testLargeArray() {
    Integer[] data = new Integer[100];
    for(int i = 0; i < 100; i++) data[i] = 100 - i; // Reverse sorted 100 to 1
    BubbleSort.bubbleSort(data);
    assertEquals(Integer.valueOf(1), data[0]);
    assertEquals(Integer.valueOf(100), data[99]);
  }

  @Test
  public void testHeapsortChildCalculation() {
    final Integer[] data = {10, 20, 15, 30, 40, 5, 25, 35, 60, 55, 1, 9, 8};
    Heapsort.heapSort(data);
    assertEquals("[1, 5, 8, 9, 10, 15, 20, 25, 30, 35, 40, 55, 60]", Arrays.toString(data));
  }

}

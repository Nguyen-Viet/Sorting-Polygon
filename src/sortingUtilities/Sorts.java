package sortingUtilities;

import java.util.ArrayList;
import java.util.Arrays;

import polygons.*;
import sun.audio.*;
import javax.sound.*;
/**
 * 
 * @author 636494 - Viet Nguyen
 * 
 * Class Definition: The Sort class holds functionality for 6 different type
 * of sorting algorithm: bubble sort, selection sort,
 * insertion sort, merge sort, quick sort, and pancake sort.
 *
 */
public class Sorts
{
	
	
	
	
	

	/**
	 * This method takes an unsorted vector and perform a bubble sort. Comparing
	 * each object by its height, volume, or base area.
	 * The bubble sort compares adjacent items and exchanges those that are out of order.
	 * 
	 * Time complexity: O(n^2)
	 * 
	 * @param polygonArray
	 *            - a vector that holds type polygon
	 * @param polygonArraylength
	 *            - the length of the vector
	 * @return a sorted array of polygon; sorted by either their height, volume,
	 *         or base area.
	 */
	public static Polygon[] bubbleSort(Polygon[] polygonArray, int polygonArraylength)
	{
		Polygon temp = null;

		for (int i = 0; i < polygonArraylength; i++)
		{

			for (int k = 1; k < (polygonArraylength - i); k++)
			{
				if (polygonArray[k - 1].compareTo(polygonArray[k]) == 1)
				{
					temp = polygonArray[k - 1];
					polygonArray[k - 1] = polygonArray[k];
					polygonArray[k] = temp;

				}
			}

		}

		return polygonArray;

	}

	/**
	 * This method takes an unsorted vector and sort it using the selection sort
	 * algorithm. Sorting by height, volume, or base area.
	 * The selection sort iterate through the vector to find the smallest item.
	 * Then it swapped it with the left most item, and that item becomes the sorted array.
	 * 
	 * Time Complexity : O(n^2)
	 * 
	 * reference: https://www.tutorialspoint.com/data_structures_algorithms/selection_sort_algorithm.htm
	 * 
	 * @param polygonArray
	 *            - a vector that holds type polygon
	 * @param polygonArraylength
	 *            - the length of the vector
	 * @return a sorted array of polygon; sorted by either their height, volume,
	 *         or base area.
	 */
	public static Polygon[] selectionSort(Polygon[] polygonArray, int polygonArraylength)
	{
		Polygon temp = null;

		for (int i = 0; i < polygonArraylength - 1; i++)
		{
			int min = i;

			for (int k = i + 1; k < polygonArraylength; k++)
			{
				if (polygonArray[k].compareTo(polygonArray[min]) == -1)
				{
					min = k;
				}
			}

			if (min != i)
			{
				temp = polygonArray[min];
				polygonArray[min] = polygonArray[i];
				polygonArray[i] = temp;
			}

		}

		return polygonArray;
	}

	/**
	 * This method sort an unsorted array using an insertion sort algorithm.
	 * Sorting is performed on its compared type: height, volume, or base area.
	 * The insertion sort sort the array one item at a time into a sublist.
	 * 
	 * Time Complexity : O(n^2)
	 * 
	 * @param polygonArray
	 *            - a vector that holds type polygon
	 * @param polygonArraylength
	 *            - the length of the vector
	 * @return a sorted array of polygon; sorted by either their height, volume,
	 *         or base area.
	 */
	public static Polygon[] insertionSort(Polygon[] polygonArray, int polygonArraylength)
	{
		Polygon polygonToInsert = null;
		int insertPostion = 0;

		for (int i = 1; i < polygonArraylength; i++)
		{

			polygonToInsert = polygonArray[i]; // select 1st element or next

			insertPostion = i;

			while (insertPostion > 0 && polygonArray[insertPostion - 1].compareTo(polygonToInsert) == 1)
			{
				polygonArray[insertPostion] = polygonArray[insertPostion - 1];
				insertPostion--;
			}

			if (insertPostion != i)
			{
				polygonArray[insertPostion] = polygonToInsert;
			}

		}

		return polygonArray;
	}

	/**
	 * This method sort an unsorted vector using the merge sort algorithm.
	 * Sorting is performed on its compared type: height, volume, or base area.
	 * reference: https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm
	 * 
	 * Time Complexity : O(n log(n) )
	 * 
	 * @param polygonArray
	 *            - a vector that holds type polygon
	 * @return a sorted array of polygon; sorted by either their height, volume,
	 *         or base area.
	 */
	public static Polygon[] mergeSort(Polygon[] polygonArray)
	{

		if (polygonArray.length == 1)
		{
			return polygonArray;
		}

		int g = 0;
		int middleIndex = (int) Math.floor(((polygonArray.length) / 2));
		Polygon[] poly1 = new Polygon[middleIndex];
		Polygon[] poly2 = new Polygon[polygonArray.length - middleIndex];

		for (int i = 0; i < polygonArray.length; i++)
		{
			if (i < middleIndex)
			{
				poly1[i] = polygonArray[i];
			} else
			{
				poly2[g] = polygonArray[i];
				g++;
			}
		}

		// divide
		mergeSort(poly1);
		mergeSort(poly2);
		merge(polygonArray, poly1, poly2);

		return polygonArray;

	}

	/**
	 * Helper method for mergeSort. 
	 * This method merges together two sorted sub array into a final sorted array.
	 * It achieves this by comparing the first element of each sub array then places
	 * them into a 3rd sorted array.
	 * 
	 * 
	 * @param polygonArray - a vector that holds type polygon
	 * @param poly1 - first sorted sub array
	 * @param poly2 - second sorted sub array
	 * @return a sorted array of type polygon; sorted by either their height, volume, or base area.
	 */
	private static Polygon[] merge(Polygon[] polygonArray, Polygon[] poly1, Polygon[] poly2)
	{
		int a = 0;
		int b = 0;

		for (int i = 0; i < polygonArray.length; ++i)
		{
			if (a == poly1.length)
			{
				polygonArray[i] = poly2[b];
				b++;
			} 
			else if (b == poly2.length)
			{
				polygonArray[i] = poly1[a];
				a++;
			} 
			else if (poly1[a].compareTo(poly2[b]) == 1)
			{
				polygonArray[i] = poly2[b];
				b++;
			} 
			else
			{
				polygonArray[i] = poly1[a];
				a++;
			}
		}

		return polygonArray;
	}

	/**
	 * This method sort an unsorted vector using the merge sort algorithm.
	 * Sorting is performed on its compared type: height, volume, or base area.
	 * Quick sort partition the array into smaller arrays. Then a pivot is chosen.
	 * Any element that's smaller than the pivot is move to the left and anything bigger is move to the right.
	 * Quick sort will recursively partition, picks a pivot and sort. It repeats until all elements have been sorted
	 * 
	 * Time Complexity : O( log(n) )
	 * 
	 * reference: http://www.geeksforgeeks.org/quick-sort/
	 * 
	 * @param polygonArray - a vector that holds type polygon
	 * @param low
	 * @param high
	 * @return
	 */
	public static Polygon[] quickSort(Polygon[] polygonArray, int low, int high)
	{
		if (low < high)
		{
			int partitionIndex = partition(polygonArray, low, high);

			quickSort(polygonArray, low, partitionIndex - 1);
			quickSort(polygonArray, partitionIndex + 1, high);
		}

		return polygonArray;
	}

	/**
	 * This method picks a pivot within the partition array and sorts it by
	 * moving element left if they're smaller and right if they're bigger.
	 * @param polygonArray
	 * @param low - the left most index
	 * @param high - the right most index
	 * @return the partition index
	 */
	private static int partition(Polygon[] polygonArray, int low, int high)
	{
		int middleIndex = (int) Math.floor(((high + low) / 2));
		int w = low - 1;
		Polygon pivot = polygonArray[middleIndex];

		for (int i = low; i < high; i++)
		{
			if (polygonArray[i].compareTo(pivot) == -1)
			{
				w++;

				Polygon temp = polygonArray[w];
				polygonArray[w] = polygonArray[i];
				polygonArray[i] = temp;
			}

		}
		
		Polygon temp = polygonArray[w + 1];
		polygonArray[w + 1] = polygonArray[high];
		polygonArray[high] = temp;

		return w + 1;
	}


	/**
	 * This method sort an unsorted vector using the merge sort algorithm.
	 * Sorting is performed on its compared type: height, volume, or base area.
	 * The pancake sort the element one by one and places the biggest element to the right of the array
	 * and reduce the current size of the current array.
	 * Then it reverse all the element and continue to find the max again.
	 * This process repeat until the array is sorted.
	 * 
	 * Time complexity : O(n^2)
	 * 
	 * Reference: http://www.geeksforgeeks.org/pancake-sorting/
	 * 
	 * @param polygonArray
	 * @param length
	 * @return 
	 */
	public static Polygon[] pancakeSort(Polygon[] polygonArray, int length)
	{
		for(int i=length; i > 1; i--)
		{
			int max = findMax(polygonArray, i);
		
			if(max!=i-1)
			{
				flip(polygonArray, max);
				flip(polygonArray, i-1);
			}
		}
		
		return polygonArray;
	}

	/**
	 * Helper method for pancakeSort. This method reverses all the element.
	 * 
	 * @param polygonArray
	 * @param i - the length of the array
	 */
	private static void flip(Polygon[] polygonArray, int i)
	{
		Polygon temp;
		int start = 0;
		
		while( start < i )
		{
			temp = polygonArray[start];
			polygonArray[start] = polygonArray[i];
			polygonArray[i] = temp;
			start++;
			i--;
		}
	}

	/**
	 * Helper method for pancakeSort. This method finds the max element within the given array.
	 * @param polygonArray
	 * @param i - the length of the array
	 * @return max - the biggest element within the array
	 */
	private static int findMax(Polygon[] polygonArray, int i)
	{
		int max;
		int n;
		for(n=0, max=0; n<i; n++)
		{
			if(polygonArray[n].compareTo(polygonArray[max]) == 1)
			{
				max = n;
			}
		}
		
		return max;
	}

}//end class

/*					
 * 'gnomeSort' is not valid for the assignment and
 * 'cycleSort' does not work properly.
 * 
 * 
 * 
public static Polygon[] gnomeSort(Polygon[] polygonArray, int length)
{
	int index = 0;

	while (index < length)
	{
		if (index == 0)
		{
			index++;
		}

		if (polygonArray[index].compareTo(polygonArray[index - 1]) >= 0)
		{
			index++;
		} else
		{
			Polygon temp = null;
			temp = polygonArray[index];
			polygonArray[index] = polygonArray[index - 1];
			polygonArray[index - 1] = temp;
			index--;
		}
	}
	return polygonArray;
} // end gnomeSort

public static Polygon[] cycleSort(Polygon[] polygonArray, int length)
{
	for (int cycle_start = 0; cycle_start <= length - 2; cycle_start++)
	{
		Polygon item = polygonArray[cycle_start];
		int pos = cycle_start;
		
		for (int i = cycle_start + 1; i < length; i++)
		{
			if (polygonArray[i].compareTo(item) == -1){
				pos++;
			}
		}

		if (pos == cycle_start){
			continue;
		}

		while (item == polygonArray[pos])
		{
			pos++;
			
		}

		if (pos != cycle_start)
		{
			Polygon temp = item;
			item = polygonArray[pos];
			polygonArray[pos] = temp;
		}

		while (pos != cycle_start)
		{
			pos = cycle_start;

			for (int i = cycle_start+1; i < length; i++)
			{
				if (polygonArray[i].compareTo(item) == -1)
				{
					pos++;
				}
			}

			while (item == polygonArray[pos])
			{
				pos++;
			}

			if (item != polygonArray[pos])
			{
				Polygon temp = item;
				item = polygonArray[pos];
				polygonArray[pos] = temp;
			}
		}
	}
	return polygonArray;
}*/



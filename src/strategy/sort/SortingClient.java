package strategy.sort;

import java.util.ArrayList;

public class SortingClient {

	public static void main(String[] args) {
		
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(4);
		testArray.add(7);
		testArray.add(13);
		testArray.add(2);
		testArray.add(8);
		
		Sorter sorter = new Sorter(new BubbleSort(), testArray);
		sorter.sort();
		
		ArrayList<Integer> testOutput = sorter.getSortedArray();
		System.out.println(testOutput);
	}

}

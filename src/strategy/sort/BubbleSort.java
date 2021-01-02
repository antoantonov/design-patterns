package strategy.sort;

import java.util.ArrayList;

public class BubbleSort implements SortingStrategy {

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> unsortedArray) {
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		tempArray = (ArrayList<Integer>) unsortedArray.clone();

		int n = tempArray.size();
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (tempArray.get(j) > tempArray.get(j+1)) {
					// swap tempArray[j+1] and tempArray[j]
					int temp = tempArray.get(j);
					tempArray.set(j, tempArray.get(j+1));
					tempArray.set(j+1,  temp);
				}
			}
		}
		
		return tempArray;
	}

}

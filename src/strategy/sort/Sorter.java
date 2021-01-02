package strategy.sort;

import java.util.ArrayList;

public class Sorter {
	private ArrayList<Integer> unsortedArray;
	private ArrayList<Integer> sortedArray;
	private SortingStrategy sortingStrategy;
	
	Sorter(SortingStrategy sortingStrategy) {
		this.unsortedArray = null;
		this.sortedArray = null;
		this.sortingStrategy = sortingStrategy;
	}
	
	Sorter(SortingStrategy sortingStrategy, ArrayList<Integer> unsortedArray) {
		this.unsortedArray = unsortedArray;
		this.sortedArray = null;
		this.sortingStrategy = sortingStrategy;
	}
	
	public void sort() {
		this.sortedArray = sortingStrategy.sort(this.unsortedArray);
	}
	
	public ArrayList<Integer> getUnsortedArray() {
		return unsortedArray;
	}
	public void setUnsortedArray(ArrayList<Integer> unsortedArray) {
		this.unsortedArray = unsortedArray;
	}
	public ArrayList<Integer> getSortedArray() {
		return sortedArray;
	}	
	
}

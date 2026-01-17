package com.sortingalgorithms.zipzipmart;

public class ZipZipMartDemo {
	
	public static void main(String[] args) {
		
		Package p1 = new Package(2300);
		Package p2 = new Package(7300);
		Package p3 = new Package(5600);
		Package p4 = new Package(2140);
		Package p5 = new Package(9230);
		
		Package[] amount = {p1, p2 , p3 , p4 , p5};
		
		MergeSort.mergeSort(amount, 0, amount.length-1);
		
		MergeSort.display(amount);

	}

}

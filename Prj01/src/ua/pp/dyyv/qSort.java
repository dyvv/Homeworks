package ua.pp.dyyv;

import java.util.*;

public class qSort {

	public static void swap(int[] array, int x, int y) {

		int tmp = array[x];
		array[x] = array[y];
		array[y] = tmp;

	}

	public static int partition(int[] array, int first, int last) {
		Random rand = new Random();
		int pivot;
		int i;
		int j;
		if (last > first) {
			pivot = array[rand.nextInt(last)];
			i = first;
			j = last;
		} 
		else 
		{
			pivot = array[rand.nextInt(first)];
			i = last;
			j = first;
		}

		

		do {
			while (array[i] < pivot) 
			{
				i++;
			}

			while (array[j] >= pivot) 
			{
				j--;
			}
			
			if (i < j) {
				swap(array, i, j);
			}

		} while (i < j);
		
		return i;

	}
	
	public static void qsort(int[] array, int first, int last)
	{
		int tmp;
		if (first<last){
		tmp	=partition(array, first, last);
		qsort(array, first, tmp-1);
		qsort(array, tmp, last);
		
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 4, 7, 16, 32, 1, 7, 18, 3 };
		qsort(array, 0, 7);
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i] + " ");
		}

	}

}

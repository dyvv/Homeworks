package ua.pp.dyyv;

public class qSort {

	public static void main(String[] args) {

		int[] arr = { 9, 11, 12, 13, 14, 5, 4, 3, 2, 1, 23 };

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
			qSort(arr, 0, arr.length-1);
			System.out.println();
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			
		}

	

	static void swap(int[] array, int x, int y) {

		int tmp = array[x];
		array[x] = array[y];
		array[y] = tmp;

	}
	
	static void qSort(int [] array, int first, int last)
	{
	  	int i=first;
	  	int j=last;
		int p=(first+last)/2;
	  	do
	  	{  while(array[i]<=array[p]) i++;
	  	   while(array[j]>=array[p]) j--;
	  	   if (i<=j) swap(array, i++, j--);
	  	   
	  			 		
	  	}while (i<=j);
	  	
		
		if (first<j) qSort(array, first, j); 
		if (last>i) qSort(array, i, last);
	  	
	}
}

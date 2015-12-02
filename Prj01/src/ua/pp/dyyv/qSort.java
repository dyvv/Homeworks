package ua.pp.dyyv;

public class qSort {

	public static void  swap(int [] array, int x, int y){
		
		int tmp=array[x];
		array[x]=array[y];
		array[y]=tmp;
		
	}
	
	public static void qsort(int [] array, int first, int last){
		
		 int x=array[(first+last)/2];
		 int i=first;
		 int j=last;
		 do{
			 while(array[i]<=x){
				 i++;
			 }
			 
			 while(array[j]>=x){
				 j--;
			 }
			 if (i<j){
				 swap(array, i, j);
			 }
			 
		 }while(i<j);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array={4,7,16,32,1,7,18,3};
		qsort(array, 1, 6);
		for (int i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}

	}

}

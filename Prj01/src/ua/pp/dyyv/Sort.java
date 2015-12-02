package ua.pp.dyyv;

public class Sort {
    static void swap(int [] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
    static void myQSort(int [] array, int left, int right) {
        if ( left >= right )
            return;
        
        swap(array, left, (left + right) / 2);
        int last = left;
        for ( int i = last + 1; i <= right; ++i )
            if ( array[i] >= array[left] )
                swap(array, ++last, i);
        
        swap(array, left, last);
        myQSort(array, left, last - 1);
        myQSort(array, last + 1, right);
    }
    
    public static void main(String[] args) {
        int [] array = { 3, 6, 1, 9, 2, 5, 0, 4, 7, 8 ,0};
        myQSort(array, 0, array.length - 1);
        
        for ( int v : array )
            System.out.print(v + " ");
        System.out.println();
    }
}
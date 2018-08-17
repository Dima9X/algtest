package algorithms;

public class BinarySearch {
    static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    public static void main(String[] args) {
           System.out.println("Find ind for 3: " + binS(3, 0, array.length));
    }

    public static int binS(int key, int start, int end) {
        int length = array.length;
        int med = (start + end) / 2;
        System.out.println(med);
        if (key == array[med]) {
            return med;
         } else {
             if (key > array[med]) {
                 binS(key, med, end);
             } else {
                 if (key < array[med]) {
                     binS(key, start, med);
                 } else         
                     return 0;
             }
            
         }
    }

}

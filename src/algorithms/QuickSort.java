package algorithms;

public class QuickSort {
    static int[] array = new int[100];
    // static int pivot = 0;

    public static void main(String[] args) {
        genArr();
        int left = 0, right = array.length - 1, pivot = 0;
        
        System.out.println("in Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        quickSort(left, right);
        System.out.println("out Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void genArr() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (0 + Math.random() * 100);
        }
    }
    /*
     * public static void quickSort2(int left, int right, int pivot) { while (right
     * > left) { // !!!!!! while (arr[left] <= arr[pivot] && right > left) { left++;
     * } while (arr[right] >= arr[pivot] && right > left) { right--; } if (left !=
     * right) { swap(left, right); left++; right--; } else { left++; right--; } } if
     * (right < left) { swap(pivot, right); } System.out.println(" "); for (int i :
     * arr) { System.out.print(i + " "); } quickSort(1, right, 0); quickSort(right +
     * 1, arr.length - 1, right);
     * 
     * }
     */
    // 5 8 1 4 7

    public static void quickSort(int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[j] >= array[cur])) {
                j--;
            }
            if (i < j) {
                swap(i, j);
                if (i == cur) {
                    cur = j;

                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        quickSort(start, cur);
        quickSort(cur + 1, end);

    }

    public static void swap(int p, int r) {
        int tmp = array[p];
        array[p] = array[r];
        array[r] = tmp;
    }

}

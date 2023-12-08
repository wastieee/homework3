package Medium;

public class second {
    public static void main(String[] args) {
        int[] array = {3, 1, 9, 6, 2, 5, 7, 8};
        int value = -1;
        System.out.println(binarySearch(array, value, 0, array.length - 1));

    }

    private static int binarySearch(int[] array, int value, int l, int r) {
        if (l == r) {
            if (array[l] == value) {
                return l;
            }
            return -1;
        }

        int m = l + (r - l) / 2;

        if (value > array[m]) {
            return binarySearch(array, value, m + 1, r);
        } else if (value < array[m]) {
            return binarySearch(array, value, l, m - 1);
        }
        return m;
    }
}

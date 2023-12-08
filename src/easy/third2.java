package easy;

public class third2 {
    public static void main(String[] args) {

        int[] array = {7, -2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        int elementToSearch = -1;

        System.out.println(linearSearch(array, elementToSearch));
    }

    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return elementToSearch;
            }
        }
        return -1;
    }
}


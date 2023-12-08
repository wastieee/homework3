package easy;

import java.util.Arrays;

public class second {
        public static void insertionSort(int[] array)
        {


            for (int i = 1; i < array.length; i++)
            {
                int value = array[i];
                int j = i;

                while (j > 0 && array[j - 1] > value)
                {
                    array[j] = array[j - 1];
                    j--;
                }



                array[j] = value;
            }
        }

        public static void main(String[] args)
        {
            int[] array = {-2,5,1,-9,0,2,5,1,8,10 };

            insertionSort(array);


            System.out.println(Arrays.toString(array));
        }
    }

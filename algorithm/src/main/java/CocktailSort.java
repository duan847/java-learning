import java.util.Arrays;

/**
 * 鸡尾酒排序
 * todo 待完善
 * 双向冒泡排序，同作从左向右、从右向左排序
 *
 * @author duanjw
 */
public class CocktailSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7, 10};
        sort(array);
    }

    public static void sort(int[] array) {
        boolean isSorted = true;
        for (int i = 0; i < array.length / 2; i++) {
            // 从左到右
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            isSorted = true;
            // 从右到左
            for (int j = array.length - i - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println("排序后：" + Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}

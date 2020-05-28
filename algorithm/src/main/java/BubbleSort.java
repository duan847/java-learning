import java.util.Arrays;

/**
 * 冒泡排序
 * todo 待完善
 * 简介：是一种基础的交换排序，可以将无序数组按规则（规则：例如从小到大）排序。
 * 原理：把数据中相邻的元素两两比较，当满足规则时交换两个元素的位置。
 * 时间复杂度：O(n²)
 *
 * @author duanjw
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7, 10};
        sortSimple(array);
        array = new int[]{5, 8, 6, 3, 9, 2, 1, 7, 10};
        sortSimple1(array);
        array = new int[]{5, 8, 6, 3, 9, 2, 1, 7, 10};
        sortSimple2(array);
    }

    /**
     * 最简单的冒泡排序
     *
     * @param array
     */
    public static void sortSimple(int[] array) {
        System.out.println("排序前：" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换两数位置
                    swap(array, j, j + 1);
                }
                System.out.println("第：" + (i + 1) + "轮第" + (j + 1) + "次" + Arrays.toString(array));
            }
        }
        System.out.println("排序后：" + Arrays.toString(array));
    }

    /**
     * 冒泡排序优化 - 如果一轮排序中没有任何元素交换顺序，说明数组已经有序，直接终止排序
     * <p>
     * 在sortSimple中，可以发现第7、8轮排序中没有任何元素交换顺序，所以我们可以在第7轮结束后直接终止后续排序。
     *
     * @param array
     */
    public static void sortSimple1(int[] array) {
        System.out.println("排序前：" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换两数位置
                    swap(array, j, j + 1);
                    isSorted = false;
                }
                System.out.println("第：" + (i + 1) + "轮第" + (j + 1) + "次" + Arrays.toString(array));
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println("排序后：" + Arrays.toString(array));
    }

    /**
     * 冒泡排序优化 - 每轮找到无序数列最大下标，以后每轮只要对比到此下标就可以停止
     *
     * @param array
     */
    public static void sortSimple2(int[] array) {
        System.out.println("排序前：" + Arrays.toString(array));
        // 最后一次交换位置的下标
        int lastExchangeIndex = 0;

        // 无序数列的边界，每次只需比较到这里
        int sortBorder = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换两数位置
                    swap(array, j, j + 1);
                    isSorted = false;
                    lastExchangeIndex = j;
                }
                System.out.println("第：" + (i + 1) + "轮第" + (j + 1) + "次" + Arrays.toString(array));
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) {
                break;
            }
        }
        System.out.println("排序后：" + Arrays.toString(array));
    }

    /**
     * 交换数组中两个元素的位置
     *
     * @param array 数组
     * @param i     元素i
     * @param j     元素j
     */
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}

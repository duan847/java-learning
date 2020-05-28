/**
 * 数组a[N]，存放了1 至N-1 个数，其中某个数重复一次。 写一个函数，找出被重复的数字.时间复杂度必须为o（N）函数原型：
 *
 * @author giegie
 * @date 2016年5月21日
 * @description
 *
 */
public class Test01 {
    public static void main(String[] args) {
        int a[] = { 1, 6, 2, 1, 5 };
        System.out.println(getNum(a, 5));
    }

    // 因为如果两个数字相等,第二次出现的数字其位置肯定不变,而a[a[0]] 可以执行到全部的位置.
    public static int getNum(int[] a, int n) {
        int temp;
        // a[0]为监视哨
        while (a[0] != a[a[0]]) {
            temp = a[0];
            a[0] = a[temp];
            a[temp] = temp;
            System.out.println(a[0] + "--" + a[temp]);
        }
        return a[0];
    }
}

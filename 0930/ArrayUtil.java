package java2;

public class ArrayUtil {
    // 두 배열을 연결하는 메서드
    public static int[] concat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;

        for (int element : a) {
            result[i++] = element;
        }

        for (int element : b) {
            result[i++] = element;
        }

        return result;
    }

    // 배열을 출력하는 메서드
    public static void print(int[] a) {
        System.out.print("[ ");
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtil.concat(array1, array2);

        ArrayUtil.print(array3); // [ 1 5 7 9 3 6 -1 100 77 ]
    }
}

package java2;

class VArray {
    private int[] array;
    private int size;

    public VArray(int initialCapacity) {
        array = new int[initialCapacity];
        size = 0;
    }

    public void add(int value) {
        if (size == array.length) {
            resize();
        }
        array[size++] = value;
    }

    public void insert(int index, int value) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size == array.length) {
            resize();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = 0;
    }

    private void resize() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public int capacity() {
        return array.length;
    }

    public int size() {
        return size;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class VArrayEx {
    public static void main(String[] args) {
        VArray v = new VArray(5); // 5개의 정수를 저장하는 가변 배열 객체 생성
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());

        for (int i = 0; i < 7; i++) { // 7개 저장
            v.add(i);
        }
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll();

        v.insert(3, 100); // 배열의 인덱스 3에 100 삽입
        v.insert(5, 200); // 배열의 인덱스 5에 200 삽입
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll();

        // 유효한 인덱스인지 확인
        if (10 < v.size()) {
            v.remove(10); // 배열의 인덱스 10의 정수 삭제
        } else {
            System.out.println("인덱스 10은 유효하지 않습니다.");
        }
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll();

        for (int i = 50; i < 55; i++) { // 5개 저장
            v.add(i);
        }
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll();
    }
}

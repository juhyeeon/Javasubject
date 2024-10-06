package java2;

class Cube {
    int length;
    int width;
    int height;

    // 생성자
    public Cube(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // 부피를 계산하는 메서드
    public int getVolume() {
        return length * width * height;
    }

    // 크기를 증가시키는 메서드
    public void increase(int length, int width, int height) {
        this.length += length;
        this.width += width;
        this.height += height;
    }

    // 부피가 0인지 확인하는 메서드
    public boolean isZero() {
        return getVolume() == 0;
    }

    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        cube.increase(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        if (cube.isZero())
            System.out.println("큐브의 부피는 0");
        else
            System.out.println("큐브의 부피는 0이 아님");
    }
}

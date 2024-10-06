package java2;

class Rectangle {
    int x, y, width, height;

    // 생성자
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // 정사각형 여부를 확인하는 메서드
    public boolean isSquare() {
        return width == height;
    }

    // 다른 사각형을 포함하는지 확인하는 메서드
    public boolean contains(Rectangle r) {
        return (this.x <= r.x && this.y <= r.y &&
                this.x + this.width >= r.x + r.width &&
                this.y + this.height >= r.y + r.height);
    }

    // 사각형 정보를 출력하는 메서드
    public void show() {
        System.out.println("사각형 (" + x + ", " + y + ")에서 시작하여 너비 " + width + ", 높이 " + height + "입니다.");
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(3, 3, 6, 6);
        Rectangle b = new Rectangle(4, 4, 2, 4);
        a.show();
        if (a.isSquare()) {
            System.out.println("a는 정사각형입니다.");
        } else {
            System.out.println("a는 정사각형이 아닙니다.");
        }
        if (a.contains(b)) {
            System.out.println("a는 b를 포함합니다.");
        } else {
            System.out.println("a는 b를 포함하지 않습니다.");
        }
    }
}

package java2;

class TV {
    String brand;
    int size;
    int price;

    // 생성자
    public TV(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    // TV 정보를 출력하는 메서드
    public void show() {
        System.out.println(brand + "에서 만든 " + size + "인치 " + price + "만원짜리 TV");
    }

    public static void main(String[] args) {
        TV tv = new TV("samsung", 50, 300);
        tv.show();
    }
}

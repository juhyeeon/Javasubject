package Class;

//실습문제 2번
class SmartTV extends ColorTV {
 private String ip;

 public SmartTV(String ip, int size, int color) {
     super(size, color);
     this.ip = ip;
 }

 @Override
 public void printProperty() {
     System.out.println("나의 SmartTV는 " + ip + " 주소의 " + getSize() + "인치 " + colorchange() + "컬러");
 }
}

public class Class2 {
 public static void main(String[] args) {
     SmartTV smartTV = new SmartTV("192.168.0.5", 77, 2000000);
     smartTV.printProperty(); // 출력: 나의 SmartTV는 192.168.0.5 주소의 77인치 2000000컬러
 }
}
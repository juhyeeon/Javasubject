package hello;

//		int sum =0 , i=1;
//		while(true) {
//			if(i >50)
//				break;
//			sum = sum+i;
//			i+=3;
//		}
//		System.out.println(sum);
	
// (1) 무엇을 계산하는 코드인가? 실행 결과 출력되는 내용은? 
// 1 ,4 ,7, 10, 13.....식으로 3씩 커지는 수를 50이 되기전까지 수들의 함들 구하는 코드    결과값: 425이다.



//(2) 위의 코드를 main()메소드로 만들고 whileLoop클래스로 완성하라
//public class T1 {
//    public static void main(String[] args) {
//        int sum = 0, i = 1;
//        while (true) {
//            if (i > 50)
//                break;
//            sum = sum + i;
//            i += 3;
//        }
//        System.out.println(sum);
//    }
//}



//(3) for 문을 이용하여 동일하기 실행되는 코드
//public class T1 {
//    public static void main(String[] args) {
//        int sum = 0;
//
//        // for 문을 사용하여 1부터 50까지 3씩 증가하는 수들의 합을 계산
//        for (int i = 1; i <= 50; i += 3) {
//            sum += i;
//        }
//
//        System.out.println(sum);
//    }
//}



//(4) do-while 문을 이용하여 동일하기 실행되는 코드
//public class T1 {
//    public static void main(String[] args) {
//        int sum = 0;
//        int i = 1;
//
//        // do-while 문을 사용하여 1부터 50까지 3씩 증가하는 수들의 합을 계산
//        do {
//            sum += i;
//            i += 3;
//        } while (i <= 50);
//
//        System.out.println(sum);
//    }
//}

package hello;

//int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
//for(int i=0;i<n.length;i++) {
//	if(n[i]>0 &&n[i]%4==0) {
//		System.out.print(n[i]+" ");
//	}
//}


//(1) 무엇을 계산하는 코드인가? 실행결과 출력되는 내용은?
// 배열안에 있는 수들을 하나씩 꺼내서 양수인지? 4의배수인지를 확인하는 코드 결과값: 20, 72, 256 이 출력된다

//(2)위코드를 main()메소드로 만들어라
//public class T2 {
//    public static void main(String[] args) {
//        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
//        
//        for (int i = 0; i < n.length; i++) {
//            if (n[i] > 0 && n[i] % 4 == 0) {
//                System.out.print(n[i] + " ");
//            }
//        }
//    }
//}



//(3)for 문을 이용하여 동일하게 실행되는 코드
//public class T2 {
//    public static void main(String[] args) {
//        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
//        
//        for (int i = 0; i < n.length; i++) {
//            if (n[i] > 0 && n[i] % 4 == 0) {
//                System.out.print(n[i] + " ");
//            }
//        }
//    }
//}



//(4)do-while 문을 이용하여 동일하기 실행되는 코드
//public class T2 {
//    public static void main(String[] args) {
//        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
//        int i = 0;
//
//        do {
//            if (n[i] > 0 && n[i] % 4 == 0) {
//                System.out.print(n[i] + " ");
//            }
//            i++;
//        } while (i < n.length);
//    }
//}

//package com.applications.lambda_stream5;
//
//import java.util.function.IntBinaryOperator;
//
//// 메서드를 변수에 대입하여 사용하는 예
//// static 써야하는지
//public class Main2 {
//    public static int addStatic(int x, int y) {
//        return x + y;
//    }
//    
//    public int addNonStatic(int x, int y) {
//        return x + y;
//    }
//    
//    public static void main(String[] args) {
//        
//        /*
//         * Main2라는 클래스명 :: 메소드명 (static 메소드만 가능)
//         * vs
//         * 인스턴스화된 것을 넣어준 mainIns변수명 :: 메소드명 (non static 메소드만 가능)
//         * => 내가 생각한 결론: "::"은 메서드(함수)를 변수에 대입하려는 것일뿐이기에 -> 클래스는
//         * 그닥 중요하지 않고 그 클래스안에 메소드를 원하는 것이기에 -> 메소드만 입출력 타입이 같으면
//         * -> 메소드를 변수에 대입할 수 있는 것 같다.
//         */
//        
//        // 
//        // Main2라는 클래스명 :: 메소드명 (static 메소드만 가능)
//        IntBinaryOperator func = Main2::addStatic;
//        IntBinaryOperator func = Main2::addNonStatic;
//        
//        int result1 = func.applyAsInt(5, 3);
//        System.out.println("5 + 3 = " + result1);
//        
//        // Main2 클래스를 mainIns변수에 인스턴스화 해주었다.
//        // 역시 mainIns변수는 static인 메소드를 사용하지는 못한다.
//        // non static인 메소드를 사용할 수 있는데
//        // 여기서 인스턴스화된 것을 넣어준 mainIns변수명 :: 메소드명
//        // -> 과 위의 것과 무슨 차이가 있는지 궁금했다.
//        Main2 mainIns = new Main2();
//        IntBinaryOperator instance = mainIns::addNonStatic;
//        IntBinaryOperator instance = mainIns::addStatic;
//        IntBinaryOperator instance2 = mainIns;
//        
//        int result2 = instance.applyAsInt(5, 3);
//        
//        int result3 = instance2.applyAsInt(5, 3);
////        int result3 = instance2.addNonStatic(5, 3);
//        System.out.println("5 + 3 = " + result2);
//    }
//    
//    
//
//}

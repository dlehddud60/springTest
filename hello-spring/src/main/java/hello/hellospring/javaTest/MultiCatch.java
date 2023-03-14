package hello.hellospring.javaTest;

public class MultiCatch {
    public static void main(String[] args) {
//        try {
//            System.out.println(3/0);
//        } catch (ArithmeticException e) {
//            System.out.println("숫자는 0으로 나눌 수 없습니다.");
//        } finally {
//            System.out.println("프로그램 종료");
//        }
//
//        try {
//            int num = Integer.parseInt("10A");
//        } catch (NumberFormatException e) {
//            System.out.println("숫자로 바굴 수 없습니다.");
//        } finally {
//            System.out.println("프로그램 종료");
//        }
//
//        System.out.println();

//

        try {
            System.out.println(3/1);
            int num = Integer.parseInt("10A");
        }catch (ArithmeticException | NumberFormatException e) {
            System.out.println("예외가 발생했습니다.");
        }
    }//main
}//end class

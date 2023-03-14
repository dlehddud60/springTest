package hello.hellospring.javaTest;

public class tryCatchTest {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);
            System.out.println("프로그램 종료");
        } catch (ArithmeticException e) {
            System.out.println("숫자는 0으로 나눌 수 없다.");
            System.out.println("프로그램 종료1");
        }//try - catch
        System.out.println("========================");
        try {
            System.out.println(3/0);
        }catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없다.");
        }finally {
            System.out.println("프로그램 종료2");
        }
    }
}

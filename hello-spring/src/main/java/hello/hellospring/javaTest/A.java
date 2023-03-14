package hello.hellospring.javaTest;

public class A {

    void abc() {
        bcd();
    }
    void bcd() {
        try {
            Class cls = Class.forName("java.lang.Object");
            Thread.sleep(1000);
        }catch (InterruptedException | ClassNotFoundException e) {
            //예외처리구문
        }
    }
}//end class

class B {
    void abc() {
        try {
            bcd();
        }catch (InterruptedException | ClassNotFoundException e){
        }
    }
    void bcd() throws InterruptedException,ClassNotFoundException {
        Class clas = Class.forName("java.lang.Object");
        Thread.sleep(1000);
    }
}

class ThrowsExeption_3 {
    public static void main(String[] args) {

    }
}


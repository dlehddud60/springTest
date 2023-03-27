package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance=new SingletonService(); //자기 자신을 static으로 가짐
    public static SingletonService getInstance(){
        return instance; //조회할 때 쓰임 참조를 꺼냄.생성할 수 있는 곳x
    }
    private SingletonService(){
    }
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}

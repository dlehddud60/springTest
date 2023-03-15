package hello.hellospring.controller;

public class MemberForm {
    private String name; //memberForm에 있는 name이라는 곳에서 값을 클라이언트측으로 부터 받아와서 값을 저장하게 된다.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

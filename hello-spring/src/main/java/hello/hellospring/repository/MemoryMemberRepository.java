package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long,Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(),member);//map객체에 회원번호와 회원객체의 주소를 저장한다.
        return member; //호출자에게 member객체의 주소를 반환한다.
    }

    @Override
    public Optional<Member> findById(Long id) { //findById 호출하면 매개변수로 키값을 주고 회원의 값을을 리턴받을 수 있따.
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) { //findByName을 호출하였을 매개변수로 name값을 주었을 때 참이라면 mamber의 이름을 반환한다.
       return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }//이름 검증

    @Override
    public List<Member> findAll() { //findAll를 호출하면 회원정보 전체를 배열로 반환한다.
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}

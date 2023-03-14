package hello.hellospring.javaTest;

import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        System.out.println(optional);
        System.out.println(optional.isPresent());

    }
}

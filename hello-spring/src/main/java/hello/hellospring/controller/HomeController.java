package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") //로컬호스트에 들어오면 이것이 호출이 됨
    public String home() {
        return "home";
    }
}

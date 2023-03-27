package hello.core.singleton;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import
org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
public class StatefulServiceTest {
 @Test
 	void statefulServiceSingleton() {
 ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
 	StatefulService statefulService1 = ac.getBean("statefulService",StatefulService.class);
 	StatefulService statefulService2 = ac.getBean("statefulService",StatefulService.class);
 //ThreadA: A사용자 10000원 주문
 int useraprice=	statefulService1.order("userA", 10000);
 //ThreadB: B사용자 20000원 주문
 int userbprice=	statefulService2.order("userB", 20000);
 //ThreadA: 사용자A 주문 금액 조회
 	//int userprice = statefulService1.getPrice();
 //ThreadA: 사용자A는 10000원을 기대했지만, 기대와 다르게 20000원 출력
 	System.out.println("price A = " + useraprice);
 	System.out.println("price B = " + userbprice);	
 	assertThat(useraprice).isNotSameAs(userbprice);
 }
 	static class TestConfig {//여기서만사용
 	@Bean
 public StatefulService statefulService() {
 	return new StatefulService();
 		}
 	}
}

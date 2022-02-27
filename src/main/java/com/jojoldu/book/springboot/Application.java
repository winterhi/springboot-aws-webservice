package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
@EnableJpaAuditing가 @SpringBootApplication와 함께 있다보니 @WebMvcTest에서도 스캔하게 됨.
 @EnableJpaAuditing를 사용하기 위해선 최소한 하나의 @Entity 클래스가 필요한데, @WebMvcTest이다 보니 @Entity 클래스가 없음.
 그래서 @EnableJpaAuditing과 @SpringBootApplication을 분리하겠음.
 */
//@EnableJpaAuditing // JPA Auditing 어노테이션을 모두 활성화할 수 있도록 함.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
package com.jojoldu.book.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
Application.java에서 @EnableJpaAuditing과 @SpringBootApplication을 분리하기 위해 따로 만듦.
@WebMvcTest는 일반적인 @Configuration은 스캔하지 않는 것을 이용.
 */
@Configuration
@EnableJpaAuditing // JPA Auditing 활성화
public class JpaConfig {
}
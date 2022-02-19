package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/** Entity 클래스에서는 절대 Setter 메소드를 만들지 않고, 필드값 변경(set)이 필요하면 명확히 그 목적과 의도를 나타낼 수 있는 메소드를 추가한다. */
@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity // 테이블과 링크될 클래스임을 나타냄. 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름을 매칭함. ex) SalesManager.java → sales_manager table
public class Posts extends BaseTimeEntity {

    @Id // 해당 테이블의 PK 필드를 나타냄.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성 규칙. 스프링 부트 2.0에서는 GenerationType.IDENTITY 해줘야 auto-increment가 된다.
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 컬럼을 나타냄(굳이 선언 안해도 클래스의 필드는 모두 컬럼이 됨). *기본값 외에 추가로 설정할 옵션이 있으면 사용.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스 생성. 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

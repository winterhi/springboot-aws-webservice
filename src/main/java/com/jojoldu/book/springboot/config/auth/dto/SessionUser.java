package com.jojoldu.book.springboot.config.auth.dto;

import com.jojoldu.book.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/* User 클래스를 사용하지 않고 새로 만들어 쓰는 이유
    : User 클래스는 엔티티이기 때문에, 직렬화 기능을 가진 세션 Dto를 하나 추가로 만들어 운영 및 유지보수에 효율. */

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
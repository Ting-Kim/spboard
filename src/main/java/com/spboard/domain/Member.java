package com.spboard.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    @Column(name="MEMBER_ID")
    private Long id;

    @Column(name="EMAIL_ID")
    private String email;

    @Column(name = "MEMBER_PW")
    private String pw;

    private String name;

    private Date birth;

    // 회원이 쓴 게시글 리스트
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Board> boardList = new ArrayList<>();
    
    // 생성자
    public Member(Long id, String email, String pw, String name, Date birth) {
        this.id = id;
        this.email = email;
        this.pw = pw;
        this.name = name;
        this.birth = birth;
    }


}

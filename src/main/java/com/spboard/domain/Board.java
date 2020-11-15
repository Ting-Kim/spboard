package com.spboard.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Board {

    @Id @GeneratedValue
    @Column(name = "BOARD_ID")
    private Long id;

    private String title;

    @Lob
    private String content;

    @Column(name = "BOARD_PW")
    private String pw;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MEMBER_ID")
    private Member member;

}

package com.spboard.domain;

import javax.persistence.*;

@Entity
public class District {

    @Id @GeneratedValue
    @Column(name="DISTRICT_ID")
    private Long id;

    @Column(name="DISTRICT_NAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="CITY_ID")
    private City city;

}

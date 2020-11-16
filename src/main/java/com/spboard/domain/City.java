package com.spboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {

    @Id @GeneratedValue
    @Column(name="CITY_ID")
    private Long id;

    @Column(name="CITY_NAME")
    private String name;


}

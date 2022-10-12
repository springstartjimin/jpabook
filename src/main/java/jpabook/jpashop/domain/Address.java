package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
@Getter @Setter
public class Address {
    @Id @GeneratedValue
    private String city;
    private String street;
    private String zipcode;
}

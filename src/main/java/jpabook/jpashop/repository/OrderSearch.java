package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.EntityManager;

@Getter @Setter
public class OrderSearch {
    private String memberName;
    private OrderStatus orderStatus;

}

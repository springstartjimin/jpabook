package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.EntityManager;

@Getter @Setter
@RequiredArgsConstructor
public class OrderSearch {
    private final EntityManager em;
    private void save(Order order) {
        em.persist(order);
    }

    public Order findOne(Long id) {
        return em.find(Order.class,id);
    }


}

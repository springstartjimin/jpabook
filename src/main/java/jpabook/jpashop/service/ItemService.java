package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepositoy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepositoy itemRepositoy;

    @Transactional
    public void saveItem(Item item){
        itemRepositoy.save(item);
    }

    public List<Item> findItems(){
        return itemRepositoy.findAll();
    }

    public Item findOne(Long itemId){
        return itemRepositoy.findOne(itemId);
    }

}

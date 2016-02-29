/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shaman.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.shaman.model.Item;

/**
 *
 * @author andriy
 */
@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService{

    private List<Item> items =new ArrayList();

    public ItemServiceImpl() {
        items.add(new Item(1,"AKC-74",15));
        items.add(new Item(2,"СВД",5));
        items.add(new Item(3,"ПМ",20));
    }
    
    
    
    @Override
    public List<Item> getAll() {
        return items;
    }

    @Override
    public void add(Item item) {           
         items.add(item);
    }

    @Override
    public void edit(Item item) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item getItemById(int itemId) {
        return items.get(itemId);
    }


    
}

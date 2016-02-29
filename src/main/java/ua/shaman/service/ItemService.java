/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shaman.service;

import java.util.List;
import ua.shaman.model.Item;


/**
 *
 * @author andriy
 */
public interface ItemService {
    List<Item> getAll();
    void add(Item item);
    void edit(Item item);
    Item getItemById(int itemId);
}

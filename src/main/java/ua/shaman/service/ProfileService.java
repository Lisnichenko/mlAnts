/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shaman.service;

import java.util.List;
import ua.shaman.model.Item;
import ua.shaman.model.Profile;


/**
 *
 * @author andriy
 */
public interface ProfileService {
    List<Profile> getAll();
    void add(Profile profile);
    void edit(Profile profile);
    List<Item> getItemsIn(Long ItemId);
}

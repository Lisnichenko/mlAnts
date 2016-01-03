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
import ua.shaman.model.Profile;
import ua.shaman.model.Soldiers;
import ua.shaman.model.Type_profile;
import ua.shaman.model.Unit;

/**
 *
 * @author shaman
 */
@Service("ProfileService")
@Transactional
public class ProfileServiceImpl implements ProfileService{

    private List<Profile> profiles =new ArrayList();
    private List<Item> items = new ArrayList();

    public ProfileServiceImpl() {
        Item item = new Item(1L,"AKC-74",10);        
        items.add(item);
        
        Profile spiper = new Profile("Sniper", "Sniper", items, 1);
        profiles.add(spiper);

    }

    @Override
    public List<Profile> getAll() {
        return profiles;
    }

    @Override
    public void add(Profile profile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Profile profile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> getItemsIn(Long ItemId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

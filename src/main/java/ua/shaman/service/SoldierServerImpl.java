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
import ua.shaman.model.Soldiers;

/**
 *
 * @author andriy
 */
@Service("soldierService")
@Transactional
public class SoldierServerImpl implements SoldierService{

    @Override
    public List<Soldiers> getAllSoldiers() {
        List<Soldiers> soldiers = new ArrayList();
        List<String> IvanProfile = new ArrayList();
        IvanProfile.add("Povar");
        IvanProfile.add("Saper");
        IvanProfile.add("operatr_AGS");
        List<String> SemenProfile = new ArrayList();
        SemenProfile.add("Avtomatchik");
        SemenProfile.add("Sanitar");
        SemenProfile.add("Zavhoz");
        
        soldiers.add(new Soldiers("Ivan", "Ivanych", "Vzvod_5 otdelenie 1", IvanProfile, 55, "Active"));
        soldiers.add(new Soldiers("Semen", "Semenych", "Vzvod_5 otdelenie 2", SemenProfile, 75, "Vacation"));
        
        return soldiers;
    }

    @Override
    public Soldiers getSoldierById(Long Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveSoldiers(Soldiers soldier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSoldiers(Soldiers soldier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

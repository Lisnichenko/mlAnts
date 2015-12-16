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
import ua.shaman.model.Unit;

/**
 *
 * @author andriy
 */
@Service("unitService")
@Transactional
public class UnitServiceImpl implements UnitService{

    @Override
    public List<Unit> getAll() {
        List<Unit> units =new ArrayList();
        units.add(new Unit("Vzvod_5_otdelenie_1",5));
        units.add(new Unit("Vzvod_5_otdelenie_2",10));
        units.add(new Unit("Vzvod_5_otdelenie_3",9));
        return units;
    }

    @Override
    public void add(Unit unit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Unit unit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Soldiers> getSoldiersIn(Long unitId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

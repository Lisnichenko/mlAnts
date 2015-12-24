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
import ua.shaman.model.Position;
import ua.shaman.model.Soldiers;
import ua.shaman.model.Unit;

/**
 *
 * @author andriy
 */
@Service("unitService")
@Transactional
public class UnitServiceImpl implements UnitService{

    private List<Unit> units =new ArrayList();

    public UnitServiceImpl() {
        Unit vzvod = new Unit("Vzvod_5", null,2,2);
        units.add(vzvod);
        units.add(new Unit("otdelenie_1",vzvod,5,3));
        units.add(new Unit("otdelenie_2",vzvod,10,2));
        units.add(new Unit("otdelenie_3",vzvod,9,2));
    }
    
    
    
    @Override
    public List<Unit> getAll() {
        return units;
    }

    @Override
    public void add(Unit unit) {
        
        Unit mainUnit = getUnitById(unit.getMainUnitId());
        unit.setMainUnit(mainUnit);
        
        int totalPosition = 0;
        for(Position pos : unit.getPosition()){
            totalPosition += pos.getCount();
        }
        
        unit.setCount(totalPosition);
        units.add(unit);
    }

    @Override
    public void edit(Unit unit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unit getUnitById(Long unitId) {
        return units.get(unitId.intValue());
    }


    
}

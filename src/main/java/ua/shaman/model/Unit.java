/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shaman.model;

import java.util.List;

/**
 *
 * @author andriy
 */
public class Unit {
    
    private Long Id;
    private String name;
    
    private Unit mainUnit;
    
    private int count;
    private int countReal;
    //used only for select in UI Form
    private Long mainUnitId;
    
    private List<Position> position;

    public Unit() {
    }

   
    public Unit(String name, Unit mainUnit, int count, int countReal) {
        this.name = name;
        this.mainUnit = mainUnit;
        this.count = count;
        this.countReal = countReal;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getMainUnit() {
        return mainUnit;
    }

    public void setMainUnit(Unit mainUnit) {
        this.mainUnit = mainUnit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCountReal() {
        return countReal;
    }

    public void setCountReal(int countReal) {
        this.countReal = countReal;
    }

    public Long getMainUnitId() {
        return mainUnitId;
    }

    public void setMainUnitId(Long mainUnitId) {
        this.mainUnitId = mainUnitId;
    }

    public List<Position> getPosition() {
        return position;
    }

    public void setPosition(List<Position> position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Unit{" + "Id=" + Id + ", name=" + name + ", mainUnit=" + mainUnit + ", count=" + count + ", countReal=" + countReal + ", mainUnitId=" + mainUnitId + ", position=" + position + '}';
    }

    
    
    
}

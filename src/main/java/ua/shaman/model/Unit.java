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
    
    private List<Position> position;

    public Unit() {
    }

    public Unit(String name, Unit mainUnit, int count, int countReal, List<Position> position) {
        this.name = name;
        this.mainUnit = mainUnit;
        this.count = count;
        this.countReal = countReal;
        this.position = position;
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

    public List<Position> getPosition() {
        return position;
    }

    public void setPosition(List<Position> position) {
        this.position = position;
    }
    
    
    
}

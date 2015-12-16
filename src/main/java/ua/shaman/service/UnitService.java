/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shaman.service;

import java.util.List;
import ua.shaman.model.Soldiers;
import ua.shaman.model.Unit;

/**
 *
 * @author andriy
 */
public interface UnitService {
    List<Unit> getAll();
    void add(Unit unit);
    void edit(Unit unit);
    List<Soldiers> getSoldiersIn(Long unitId);
}

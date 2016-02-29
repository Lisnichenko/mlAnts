package ua.shaman.service;


import java.util.List;
import ua.shaman.model.Soldiers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andriy
 */
public interface SoldierService {
    List<Soldiers> getAllSoldiers();
    Soldiers getSoldierById(Long Id);
    void saveSoldiers(Soldiers soldier);
    void deleteSoldiers(Soldiers soldier);

    public Object getAll();
}

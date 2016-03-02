/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shaman.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.shaman.model.Position;
import ua.shaman.model.Soldiers;
import ua.shaman.service.SoldierService;

/**
 *
 * @author andriy
 */
@Controller
public class SoldiersController {
    @Autowired
    private SoldierService soldierService;
	
    @RequestMapping(value = { "/soldiers_list" }, method = RequestMethod.GET)
    public String list(ModelMap model) {
        model.addAttribute("soldiers", soldierService.getAll());
        return "soldiers_list";
    }
    
     @RequestMapping(value = { "/soldiers_add" }, method = RequestMethod.GET)
    public String add(ModelMap model) {
        Soldiers soldier = new Soldiers();
        List<Position> positions = new ArrayList();
        positions.add(new Position());
        soldier.setPosition(positions);
        
        model.addAttribute("soldier", soldier);
        model.addAttribute("soldierItems", soldierService.getAll());
        return "soldiers_add";
    }
}

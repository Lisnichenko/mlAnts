/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shaman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.shaman.service.UnitService;

/**
 *
 * @author andriy
 */
@Controller
public class UnitsController {
    @Autowired
    private UnitService unitService;
    
    @RequestMapping(value = { "/units_list" }, method = RequestMethod.GET)
    public String list(ModelMap model) {
        model.addAttribute("units", unitService.getAll());
        return "units_list";
    }
    
    @RequestMapping(value = { "/units_add" }, method = RequestMethod.GET)
    public String add(ModelMap model) {
        model.addAttribute("units", "add list of units");
        return "units_add";
    }
    
    @RequestMapping(value = { "/units_edit" }, method = RequestMethod.GET)
    public String edit(ModelMap model) {
        model.addAttribute("units", "add list of units");
        return "units_edit";
    }
    
    @RequestMapping(value = { "/units_soldiers_in" }, method = RequestMethod.GET)
    public String soldiersIn(ModelMap model) {
        model.addAttribute("units", "add list of units");
        return "units_soldiers_in";
    }
}

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
        model.addAttribute("soldiers", soldierService.getAllSoldiers());
        return "soldiers_list";
    }
}

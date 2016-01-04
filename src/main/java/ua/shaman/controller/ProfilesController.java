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
import ua.shaman.service.ProfileService;
import ua.shaman.service.UnitService;

/**
 *
 * @author andriy
 */
@Controller
public class ProfilesController {
    @Autowired
    private ProfileService profileService;
    
    @RequestMapping(value = { "/profiles_list" }, method = RequestMethod.GET)
    public String list(ModelMap model) {
        model.addAttribute("profiles", profileService.getAll());
        return "profiles_list";
    }
    
    @RequestMapping(value = { "/profiles_add" }, method = RequestMethod.GET)
    public String add(ModelMap model) {
        model.addAttribute("profiles", "add list of profiles");
        return "profiles_add";
    }
    
    @RequestMapping(value = { "/profiles_edit" }, method = RequestMethod.GET)
    public String edit(ModelMap model) {
        model.addAttribute("profiles", "edit list of profiles");
        return "profiles_edit";
    }
    
    @RequestMapping(value = { "/profiles_items_in" }, method = RequestMethod.GET)
    public String soldiersIn(ModelMap model) {
        model.addAttribute("profiles", "add list of items");
        return "profiles_items_in";
    }
}

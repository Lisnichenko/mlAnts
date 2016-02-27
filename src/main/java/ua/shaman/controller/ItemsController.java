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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.shaman.model.Item;
import ua.shaman.service.ItemService;

/**
 *
 * @author andriy
 */
@Controller
public class ItemsController {
    @Autowired
    private ItemService itemService;
    
    @RequestMapping(value = { "/items_list" }, method = RequestMethod.GET)
    public String list(ModelMap model) {
        model.addAttribute("items", itemService.getAll());
        return "items_list";
    }
    
    @RequestMapping(value = "/items_add", method = RequestMethod.GET)
    public String add(ModelMap model) {
        Item item = new Item();
       
        model.addAttribute("item", item);
        model.addAttribute("itemItems", itemService.getAll());
        return "items_add";
    }
    
    @RequestMapping(value = "/items_add", method = RequestMethod.POST)
    public String saveItem(Item item, BindingResult result,ModelMap model) {
        System.out.println(">> added item is " + item);
        itemService.add(item);
        model.addAttribute("message", "saveItemSuccessfull");
        model.addAttribute("itemName", "DA");
        return "redirect:items_list";
    }
    
    @RequestMapping(value = { "/items_edit" }, method = RequestMethod.GET)
    public String edit(ModelMap model) {
        model.addAttribute("items", "add list of items");
        return "items_edit";
    }
    
 
}

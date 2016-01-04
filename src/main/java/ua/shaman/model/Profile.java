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
public class Profile {
    
    private Long Id;
    private String name;
    
    private String descriptions;
    private List<Item> items;    
     
    private int count_people;

    public Profile() {
    }

    public Profile(String name, String descriptions, List<Item> items, int count_people) {
        this.name = name;
        this.descriptions = descriptions;
        this.items = items;
        this.count_people = count_people;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getCount_people() {
        return count_people;
    }

    public void setCount_people(int count_people) {
        this.count_people = count_people;
    }

  
    
}

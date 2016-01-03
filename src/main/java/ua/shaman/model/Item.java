/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shaman.model;

/**
 *
 * @author andriy
 */
public class Item {
    
    private Long Id;
    private String name;
    private int count;

    public Item() {
    }

    public Item(Long Id, String name, int count) {
        this.Id = Id;
        this.name = name;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    
}

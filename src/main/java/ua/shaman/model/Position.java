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
public class Position {
    
    private Long Id;
    private String name;
    private int count;

    public Position() {
    }

    public Position(Long Id, String name, int count) {
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

    @Override
    public String toString() {
        return "Position{" + "Id=" + Id + ", name=" + name + ", count=" + count + '}';
    }
    
    
    
}

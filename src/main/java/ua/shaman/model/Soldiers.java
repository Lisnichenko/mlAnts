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
public class Soldiers {
    
    private String name;
    private String surname;
    private String subdivision;
    private List<String> profile;
    private int readiness;
    private String status;

    public Soldiers() {
    }

    public Soldiers(String name, String surname, String subdivision, List<String> profile, int readiness, String status) {
        this.name = name;
        this.surname = surname;
        this.subdivision = subdivision;
        this.profile = profile;
        this.readiness = readiness;
        this.status = status;
    }

    public int getReadiness() {
        return readiness;
    }

    public void setReadiness(int readiness) {
        this.readiness = readiness;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public List<String> getProfile() {
        return profile;
    }

    public void setProfile(List<String> profile) {
        this.profile = profile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String getFullName(){
        return name + " " + surname;    
    }
    
    public String getAllProfile(){
        StringBuilder prof = new StringBuilder();
        for( String str : profile){
            prof.append(str);
            prof.append(", ");
        }
        return prof.toString();
    }
}

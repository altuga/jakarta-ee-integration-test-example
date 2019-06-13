/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ping.boundary;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author altuga
 */
@Entity
@NamedQuery(name = "all" , query = "select flight from Flight flight")
public class Flight {
    
    @Id
    @GeneratedValue
    private long id;
    
    public String number;
    
    public int numberOfSeats;

    @JsonbCreator
    public Flight(@JsonbProperty("number")  String number, 
                  @JsonbProperty("numberOfSeats") int numberOfSeats) {
        this.number = number;
        this.numberOfSeats = numberOfSeats;
    }

    public Flight() {
    }
    
    
    
    
    
}

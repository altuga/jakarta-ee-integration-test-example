/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.airport.flight.entity;

import com.airhacks.ping.boundary.Flight;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author altuga
 */
public class FlightIT {
    
    private EntityManager entityManager;
    private EntityTransaction tx;
    
    
    @Before
    public void initEM() {
        
        this.entityManager = 
                Persistence.
                        createEntityManagerFactory("it").
                        createEntityManager();
        this.tx = this.entityManager.getTransaction();
        
    }
    
    @Test
    public void crudTest() {
        Flight flight = new Flight("new flight", 2) ;
        this.tx.begin();
        this.entityManager.persist(flight);
        this.tx.commit();
        
        List<Flight> flightList = this.entityManager.
                createNamedQuery("all", Flight.class).getResultList();
        
        System.out.println("flights " + flightList);
        Assert.assertFalse(flightList.isEmpty());
        
        
    }
    
}

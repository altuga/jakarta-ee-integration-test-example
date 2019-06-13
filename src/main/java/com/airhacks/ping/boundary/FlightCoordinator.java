/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ping.boundary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author altuga
 */
@Stateless
public class FlightCoordinator {
        
   
    @PersistenceContext
    EntityManager entityManager;
    
    public List<Flight> getFlights() {
        return entityManager.createNamedQuery("all", Flight.class).getResultList();
        
    }
    
    public void save(Flight flight) {
        entityManager.persist(flight);
      
    }
}

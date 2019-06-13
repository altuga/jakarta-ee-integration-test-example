package com.airhacks.ping.boundary;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
@Stateless
public class FlightResource {

    
    @Inject
    FlightCoordinator coordinator; 
    
    @GET
    public List<Flight> ping() {
        return coordinator.getFlights();
    }
    
    @POST
    public void save(Flight flight) {
        this.coordinator.save(flight);
    }

}

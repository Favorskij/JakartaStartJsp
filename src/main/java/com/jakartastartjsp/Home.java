package com.jakartastartjsp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Home {

    @GET
    @Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")
    public String getIt() {
        return "Привет мир!!!";
    }

}

package org.feuyeux.jaxrs2.atup.user;

import org.feuyeux.jaxrs2.atup.user.resource.AtupUserResource;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api/*")
public class AtupUserApplication extends ResourceConfig {
    public AtupUserApplication() {
        register(AtupUserResource.class);
    }
}
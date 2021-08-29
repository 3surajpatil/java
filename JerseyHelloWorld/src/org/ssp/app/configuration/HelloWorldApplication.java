package org.ssp.app.configuration;

import org.glassfish.jersey.server.ResourceConfig;

public class HelloWorldApplication extends ResourceConfig {
    public HelloWorldApplication() {
        // Define the package which contains the service classes.
        packages("org.ssp.jaxrs.resources");
    }
}
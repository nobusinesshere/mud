package com.argondamn.mud.client.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author tim
 */
@ApplicationPath("mud")
public class Application extends ResourceConfig {
    public Application() {
        packages("com.argondamn.mud");
    }
}

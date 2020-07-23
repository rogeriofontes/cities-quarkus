package br.com.meetupex.cities

import org.eclipse.microprofile.config.inject.ConfigProperty
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class HelloResource {

    @ConfigProperty(name = "message", defaultValue = "Hello from default")
    var message: String? = null

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String? {
        return message
    }
}
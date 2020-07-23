package br.com.meetupex.cities.resources

import br.com.meetupex.cities.model.Country
import br.com.meetupex.cities.service.CountriesService
import org.eclipse.microprofile.rest.client.inject.RestClient
import org.jboss.resteasy.annotations.jaxrs.PathParam
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/country")
class CountriesResource {

    @Inject
    @RestClient
    var countriesService: CountriesService? = null

    @GET
    @Path("/ac")
    @Produces(MediaType.APPLICATION_JSON)
    fun nameCountry(): String {
        return "BR"
    }

    @GET
    @Path("/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    fun name(@PathParam name: String?): List<Country> {
        return countriesService!!.getByName(name)
    }
}
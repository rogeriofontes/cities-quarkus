package br.com.meetupex.cities.service

import br.com.meetupex.cities.model.Country
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import org.jboss.resteasy.annotations.jaxrs.PathParam
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path("/v2")
@RegisterRestClient
interface CountriesService {

    @GET
    @Path("/name/{name}")
    @Produces("application/json")
    fun getByName(@PathParam name: String?): List<Country>
}
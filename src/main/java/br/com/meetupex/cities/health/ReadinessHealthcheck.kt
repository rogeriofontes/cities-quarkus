package br.com.meetupex.cities.health

import org.eclipse.microprofile.health.HealthCheck
import org.eclipse.microprofile.health.HealthCheckResponse
import org.eclipse.microprofile.health.Readiness
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
@Readiness
class ReadinessHealthcheck : HealthCheck {
    override fun call(): HealthCheckResponse {
        return HealthCheckResponse.named("Employee Health Check").up().build()
    }
}
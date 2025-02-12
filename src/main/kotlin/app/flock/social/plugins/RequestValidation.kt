package app.flock.social.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.requestvalidation.RequestValidation

fun Application.configureRequestValidation(){
    install(RequestValidation) {
        // TODO re-add request validation
    }
}
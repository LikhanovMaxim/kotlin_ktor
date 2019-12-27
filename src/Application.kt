package com.example

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

/*
https://ktor.io/quickstart/guides/application.html#running
 */
fun main(args: Array<String>) {
    val server = embeddedServer(Netty, 8080, "localhost") {
        routing {
            get("/") {
                call.respondText("Hello, world!", ContentType.Text.Html)
            }
            get("/xml"){
                call.respondText ("<xml> Hi from xml</xml>", ContentType.Text.Xml)
            }

        }
    }
    server.start(wait = true)
}
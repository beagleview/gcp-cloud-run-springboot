package com.bgv.gcp.cloudrun

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudrunApplication

fun main(args: Array<String>) {
	runApplication<CloudrunApplication>(*args)
}

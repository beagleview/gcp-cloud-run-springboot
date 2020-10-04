package com.bgv.gcp.cloudrun.model

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
class Student {
    @Id
    var id: String? = UUID.randomUUID().toString()
    var firstName: String? = null
    var lastName: String? = null
    override fun toString(): String {
        return ObjectMapper().writeValueAsString(this)
    }
}

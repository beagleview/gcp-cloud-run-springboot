package com.bgv.gcp.cloudrun.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Student {
    @Id
    var id: String? = null
    var firstName: String? = null
    var lastName: String? = null
}
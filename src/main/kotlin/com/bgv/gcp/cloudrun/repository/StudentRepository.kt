package com.bgv.gcp.cloudrun.repository

import com.bgv.gcp.cloudrun.model.Student
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface StudentRepository : ReactiveMongoRepository<Student, String>

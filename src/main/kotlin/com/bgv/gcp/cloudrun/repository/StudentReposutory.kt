package com.bgv.gcp.cloudrun.repository

import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface EventReposidtory : ReactiveMongoRepository<Student:String>{
    fun findByFirstName(firstName: String): Mono(Student)
}
package com.bgv.gcp.cloudrun.service

import com.bgv.gcp.cloudrun.model.Student
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface StudentService {
    fun find(id: String): Mono<Student>

    fun list(): Flux<Student>

    fun create(student: Student): Mono<Student>

    fun delete(id: String): Mono<Void>
}

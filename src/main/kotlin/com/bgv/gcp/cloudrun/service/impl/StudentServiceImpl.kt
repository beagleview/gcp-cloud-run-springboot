package com.bgv.gcp.cloudrun.service.impl

import com.bgv.gcp.cloudrun.model.Student
import com.bgv.gcp.cloudrun.repository.StudentRepository
import com.bgv.gcp.cloudrun.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class StudentServiceImpl : StudentService{
    @Autowired lateinit var studentRepository: StudentRepository
    override fun find(id: String): Mono<Student> {
        return studentRepository.findById(id)
    }

    override fun list(): Flux<Student> {
        return studentRepository.findAll()
    }

    override fun create(student: Student): Mono<Student> {
        return studentRepository.save(student)
    }

    override fun delete(id: String): Mono<Void> {
        return studentRepository.deleteById(id)
    }
}

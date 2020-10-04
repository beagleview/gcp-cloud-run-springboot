package com.bgv.gcp.cloudrun.controller

import com.bgv.gcp.cloudrun.service.StudentService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import com.bgv.gcp.cloudrun.model.Student

@RestController
@RequestMapping("/api/student")
class StudentController{
    @Autowired
    lateinit var studentService: StudentService

    val logger = LoggerFactory.getLogger(this.javaClass)

    @PostMapping("/")
    fun create(@RequestBody student: Student): Mono<Student> {
        logger.info("[save student information] request parameter: {}, student")
                return studentService.create(student)
    }

    @GetMapping("/list")
    fun listStudent(): Flux<Student> {
        return studentService.list()
    }

    @GetMapping("/id")
    fun student(@RequestParam id : String): Mono<Student> {
        logger.info("Query Student Number: {}, id")
                return studentService.find(id)
    }
}

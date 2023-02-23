package com.example.mongodb_study

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories
@SpringBootApplication
class MongodbStudyApplication

fun main(args: Array<String>) {
    runApplication<MongodbStudyApplication>(*args)
}

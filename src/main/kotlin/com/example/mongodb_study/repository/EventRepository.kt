package com.example.mongodb_study.repository

import com.example.mongodb_study.data.EventDoc
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EventRepository : MongoRepository<EventDoc, Long>{
    fun findByTitle(title: String) : List<EventDoc>
}
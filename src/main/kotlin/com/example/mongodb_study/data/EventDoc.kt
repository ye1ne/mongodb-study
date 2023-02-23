package com.example.mongodb_study.data

import jakarta.persistence.Entity
import jakarta.persistence.Id

import org.springframework.data.mongodb.core.mapping.Document
@Entity
@Document("event")
data class EventDoc (
    @Id
    val id: Long,

    var title: String,
    var comment : String,
)
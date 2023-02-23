package com.example.mongodb_study.service


import com.example.mongodb_study.data.EventDoc
import com.example.mongodb_study.repository.EventRepository
import org.springframework.stereotype.Service

@Service
class EventService (
    val eventRepository: EventRepository,
){
    fun insertEvent(body: EventDoc) =
        eventRepository.insert(body)

    fun getAllEventList() =
        eventRepository.findAll()

    fun getEventList(title: String) =
        eventRepository.findByTitle(title)


}
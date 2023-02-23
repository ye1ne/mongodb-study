package com.example.mongodb_study.web

import com.example.mongodb_study.web.dto.CreateEventRequestDTO
import com.example.mongodb_study.service.EventService
import com.example.mongodb_study.data.EventDoc
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EventController(
    val eventService: EventService,
) {
    @PostMapping("/new")
    fun insertEvent(@RequestBody request: CreateEventRequestDTO) : String{
        eventService.insertEvent(
            EventDoc(
            id = request.id,
            title = request.title,
            comment = request.comment)
        )
        return "ok"
    }


    //원래는 바로 반환하면 안되지만 테스트의 편의를 위해 바로 반환토록함
    @GetMapping("/all")
    fun findEvents() =
        eventService.getAllEventList()
}
package com.example.survey.controller

import com.example.survey.model.SurveyResponse
import com.example.survey.service.SurveyService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/survey")
class SurveyController(private val surveyService: SurveyService) {

    @PostMapping
    fun submitSurvey(@RequestBody response: SurveyResponse): ResponseEntity<String> {
        surveyService.saveResponse(response)
        return ResponseEntity.ok("Response saved successfully.")
    }
}
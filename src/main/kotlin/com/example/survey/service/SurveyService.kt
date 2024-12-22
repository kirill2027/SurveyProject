package com.example.survey.service

import com.example.survey.model.SurveyResponse
import com.example.survey.repository.SurveyRepository
import org.springframework.stereotype.Service

@Service
class SurveyService(private val surveyRepository: SurveyRepository) {

    fun saveResponse(response: SurveyResponse) {
        surveyRepository.save(response)
    }
}
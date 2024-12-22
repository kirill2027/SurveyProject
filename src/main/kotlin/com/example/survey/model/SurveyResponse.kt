package com.example.survey.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class SurveyResponse(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val userId: Long,
    val questionId: Long,
    val answerText: String,
    val premium: Boolean = false,
    val timestamp: LocalDateTime = LocalDateTime.now()
)
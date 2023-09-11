package com.example.highthon.domain.user.presentation.dto.response

import java.util.*

data class UserProfileResponse(
    val id: UUID,
    val name: String,
    val grade: Int,
    val phoneNumber: String,
    val school: String
)
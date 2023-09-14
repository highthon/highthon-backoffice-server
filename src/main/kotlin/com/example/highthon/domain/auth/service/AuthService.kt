package com.example.highthon.domain.auth.service

import com.example.highthon.domain.auth.presentation.dto.request.ChangePasswordRequest
import com.example.highthon.domain.auth.presentation.dto.request.ChangePhoneNumberRequest
import com.example.highthon.domain.auth.presentation.dto.request.LoginRequest
import com.example.highthon.domain.auth.presentation.dto.request.SignUpRequest
import com.example.highthon.domain.auth.presentation.dto.response.TokenResponse

interface AuthService {

    fun login(req: LoginRequest): TokenResponse
    fun signup(request: SignUpRequest, phoneNumber: String, number: Int)

    fun changePhoneNumber(req: ChangePhoneNumberRequest): UserProfileResponse

    fun changePassword(req: ChangePasswordRequest): UserProfileResponse
}

package com.example.highthon.domain.apply.service

import com.example.highthon.domain.apply.presentaion.dto.request.ApplyRequest
import com.example.highthon.domain.apply.presentaion.dto.response.ApplyResponse
import java.util.UUID

interface ApplyService {

    fun apply(req: ApplyRequest): ApplyResponse

    fun edit(req: ApplyRequest): ApplyResponse

    fun cancel(reason: String)

    fun getDetail(id: UUID): ApplyResponse
}

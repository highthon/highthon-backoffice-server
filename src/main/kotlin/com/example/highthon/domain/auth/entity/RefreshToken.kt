package com.example.highthon.domain.auth.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.index.Indexed

@RedisHash(timeToLive = 60 * 24 * 7)
data class RefreshToken (

    @Id
    var id: String,

    @Indexed
    var token: String
)
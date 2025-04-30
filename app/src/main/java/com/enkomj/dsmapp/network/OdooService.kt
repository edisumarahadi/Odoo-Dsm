package com.enkomj.dsmapp.network

import com.enkomj.dsmapp.model.LoginRequest
import com.enkomj.dsmapp.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface OdooService {
    @POST("/web/session/authenticate")
    fun login(@Body request: LoginRequest): Call<LoginResponse>
}
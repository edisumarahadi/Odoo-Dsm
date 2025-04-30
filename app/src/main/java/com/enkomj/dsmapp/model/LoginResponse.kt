package com.enkomj.dsmapp.model

data class LoginResponse(
    val result: LoginResult?
)

data class LoginResult(
    val uid: Int?,
    val session_id: String?,
    val user_context: Map<String, Any>?
)

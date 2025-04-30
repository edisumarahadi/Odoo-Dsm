package com.enkomj.dsmapp.model

data class LoginRequest(
    val jsonrpc: String = "2.0",
    val method: String = "call",
    val params: LoginParams
)

data class LoginParams(
    val db: String,
    val login: String,
    val password: String
)

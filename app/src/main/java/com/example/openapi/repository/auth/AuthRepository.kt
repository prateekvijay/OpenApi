package com.example.openapi.repository.auth

import com.example.openapi.api.auth.OpenApiAuthService
import com.example.openapi.persistence.AccountPropertiesDao
import com.example.openapi.persistence.AuthTokenDao
import com.example.openapi.session.SessionManager

class AuthRepository constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
)
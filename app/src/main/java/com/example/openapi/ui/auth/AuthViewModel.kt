package com.example.openapi.ui.auth

import androidx.lifecycle.ViewModel
import com.example.openapi.repository.auth.AuthRepository

class AuthViewModel constructor(val authRepository: AuthRepository) : ViewModel()
package com.example.openapi.session

import android.app.Application
import com.example.openapi.persistence.AuthTokenDao

class SessionManager constructor(val authTokenDao: AuthTokenDao, val application: Application)
package com.example.conexion.utils

import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import com.loopj.android.http.RequestParams

class HttpUtils {

    companion object {
        private const val BASE_URL = "www.asdasd.com"

        private val asyncHttpClient : AsyncHttpClient = AsyncHttpClient()

        fun post(params : RequestParams, reponseHandler : AsyncHttpResponseHandler){
            asyncHttpClient.connectTimeout = 30000
            asyncHttpClient.post(BASE_URL, params, reponseHandler)
        }

    }
}
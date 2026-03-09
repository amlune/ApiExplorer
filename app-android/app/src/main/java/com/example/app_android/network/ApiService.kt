package com.example.app_android.network

import com.example.app_android.model.Post
import retrofit2.Call
import retrofit2.http.GET
interface ApiService {
 @GET("posts")
 fun getPosts(): Call<List<Post>>
}
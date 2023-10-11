package com.example.day_1.api

import android.content.Context
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class JokesRepository {

    // This function takes a Context and callback function as a parameter, which will be called when the API response is received.
    fun getjokes(context: Context, callback: (jokesModel) -> Unit) {

        // Create a Retrofit instance with the base URL and a GsonConverterFactory for parsing the response.
        val retrofit: Retrofit = Retrofit.Builder().baseUrl("https://api.chucknorris.io/").addConverterFactory(
            GsonConverterFactory.create()).build()

        // Create an ApiService instance from the Retrofit instance.
        val service: jokesService = retrofit.create(jokesService::class.java)

        // Call the getjokes() method of the ApiService to make an API request.
        val call: Call<jokesModel> = service.getJokes()

        // Use the enqueue() method of the Call object to make an asynchronous API request.

        call.enqueue(object : Callback<jokesModel> {
            override fun onResponse(call: Call<jokesModel>, response: Response<jokesModel>) {
                if (response.isSuccessful) {
                    val jokes: jokesModel? = response.body()

                    if (jokes != null) {
                        // Call the callback function with the JokesModel object as a parameter.
                        callback(jokes)
                    } else {
                        // Handle the case where the response body is null.
                        Toast.makeText(context, "Response body is null", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    // Handle the case where the response is not successful.
                    Toast.makeText(context, "Request unsuccessful. Status code: ${response.code()}", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<jokesModel>, t: Throwable) {
                // This method is called when the API request fails.
                Toast.makeText(context, "Request Fail", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
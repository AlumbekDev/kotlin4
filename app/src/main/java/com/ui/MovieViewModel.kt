package com.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.api.RetrofitClient
import com.base.BaseViewModel
import com.model.Movies
import kotlinx.coroutines.launch

class MovieViewModel : BaseViewModel() {

    val moviesList = MutableLiveData<List<Movies>>()

    fun getMovie() {
        uiScope.launch {
           RetrofitClient.movieApi.getMovies().let {
                if (it.isSuccessful) {
                    moviesList.value = it.body()
                } else {
                    Log.e("TAG", "movie: Error ${it?.code()}")
                }
            }
        }
    }
}
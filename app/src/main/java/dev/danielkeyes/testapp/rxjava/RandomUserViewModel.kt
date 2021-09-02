package dev.danielkeyes.testapp.rxjava

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.danielkeyes.testapp.api.RandomUser
import dev.danielkeyes.testapp.api.RandomUserAPI
import kotlinx.coroutines.async

class RandomUserViewModel: ViewModel() {
    private val _randomUser = MutableLiveData<RandomUser>()
    val randomUser: LiveData<RandomUser>
        get() = _randomUser

    private val randomUserAPI = RandomUserAPI.create()

    init {
        refreshRandomUser()
        Log.e("dkeyes", "RandomUserViewModel init")
    }

    fun refreshRandomUser() {
        viewModelScope.async {
            Log.e("dkeyes RxJava","here 1")
            _randomUser?.value = randomUserAPI.getRandomUser()
            Log.e("dkeyes RxJava", _randomUser.value.toString())
            Log.e("dkeyes RxJava","here 2")

        }
    }
}
package amitapps.media.viewmodelpractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count = 0

    private val _counter = MutableLiveData<Int>()
    var counter: LiveData<Int> = _counter

    fun incrementValue() {
        count++
        _counter.postValue(count)
    }

    fun decrementValue() {
        count--
        _counter.postValue(count)
    }



}
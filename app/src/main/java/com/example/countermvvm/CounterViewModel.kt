package com.example.countermvvm
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf;
import androidx.lifecycle.ViewModel
import com.example.countermvvm.CounterRepository

class CounterViewModel():ViewModel() {
    private val repository: CounterRepository = CounterRepository()
    private val _count = mutableStateOf(repository.getCounter().count)

    //Expose the count as an immutable state
    val count:MutableState<Int> = _count
    fun increment(){
        repository.incrimentCounter()
        _count.value = repository.getCounter().count
    }
    fun decrememnt(){
        repository.decrimentCounter()
        _count.value = repository.getCounter().count
    }
}
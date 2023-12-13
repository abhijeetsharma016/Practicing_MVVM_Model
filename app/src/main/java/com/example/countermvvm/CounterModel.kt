package com.example.countermvvm

data class CounterModel(var count:Int)

class CounterRepository{
    private var _counter = CounterModel(0);

    fun getCounter()= _counter

    fun incrimentCounter(){
        _counter.count++
    }
    fun decrimentCounter(){
        _counter.count--
    }
}
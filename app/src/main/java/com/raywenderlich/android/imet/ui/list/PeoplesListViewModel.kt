package com.raywenderlich.android.imet.ui.list

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MediatorLiveData
import com.raywenderlich.android.imet.IMetApp
import com.raywenderlich.android.imet.data.model.People
import java.lang.Appendable

/**
 * PeoplesListViewModel
 *
 * @author djzhao
 * @date 21/02/18
 */
class PeoplesListViewModel(application: Application) : AndroidViewModel(application) {

    private val peopleRepository = getApplication<IMetApp>().getPeopleRepository()
    private val peopleList = MediatorLiveData<List<People>>()

    init {
        getAllPeople()
    }

    fun getAllPeople() {
        peopleList.addSource(peopleRepository.getAllPeople()) {
            peopleList.postValue(it)
        }
    }

    fun getPeopleList(): MediatorLiveData<List<People>> {
        return peopleList
    }

    fun searchPeople(name: String) {
        peopleList.addSource(peopleRepository.findBy(name)) {
            peopleList.postValue(it)
        }
    }

}
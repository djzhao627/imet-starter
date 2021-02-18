package com.raywenderlich.android.imet.ui.details

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import com.raywenderlich.android.imet.IMetApp
import com.raywenderlich.android.imet.data.model.People

/**
 * PeopleDetailsViewModel
 *
 * @author djzhao
 * @date 21/02/18
 */
class PeopleDetailsViewModel(application: Application): AndroidViewModel(application) {
    private val peopleRepository = getApplication<IMetApp>().getPeopleRepository()
    private val peopleId = MutableLiveData<Int>()

    fun getPeopleDetail(id: Int):LiveData<People> {
        peopleId.value = id
        val peopleDetails = Transformations.switchMap<Int, People>(peopleId) {
            peopleRepository.findPeople(it)
        }
        return peopleDetails
    }
}
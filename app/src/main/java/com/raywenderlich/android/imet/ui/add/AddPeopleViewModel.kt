package com.raywenderlich.android.imet.ui.add

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import com.raywenderlich.android.imet.IMetApp
import com.raywenderlich.android.imet.data.model.People

/**
 * AddPeopleViewModel
 *
 * @author djzhao
 * @date 21/02/18
 */
class AddPeopleViewModel(application: Application): AndroidViewModel(application) {
    private val repository = getApplication<IMetApp>().getPeopleRepository()

    fun addPeople(people : People) {
        repository.insertPeople(people)
    }
}
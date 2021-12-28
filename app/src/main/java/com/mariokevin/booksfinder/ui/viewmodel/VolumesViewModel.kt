package com.mariokevin.booksfinder.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mariokevin.booksfinder.data.model.VolumesSearchModel
import com.mariokevin.booksfinder.domain.GetVolumesByName
import kotlinx.coroutines.launch

class VolumesViewModel:ViewModel() {
    val volumesModel=MutableLiveData<VolumesSearchModel>()
    var getVolumesByName=GetVolumesByName()

    fun onCreate(url:String){
        viewModelScope.launch {
            val result = getVolumesByName(url)

            if(!result.isNullOrEmpty()){
                for (volume in result){
                    volumesModel.postValue(volume)
                }
            }
        }
    }
}
package com.mariokevin.booksfinder.domain

import com.mariokevin.booksfinder.data.VolumesRepository
import com.mariokevin.booksfinder.data.model.VolumesSearchModel

class GetVolumesByName {
    private val repository=VolumesRepository()
    suspend operator fun invoke(url:String):List<VolumesSearchModel>?= repository.getVolumesByName(url)
}
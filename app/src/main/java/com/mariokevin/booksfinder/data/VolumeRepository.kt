package com.mariokevin.booksfinder.data

import com.mariokevin.booksfinder.data.model.VolumesSearchModel
import com.mariokevin.booksfinder.data.network.VolumeService

class VolumeRepository {
    private val api = VolumeService()
    suspend fun getVolumesByName(url:String):List<VolumesSearchModel>{
        val response = api.getVolumes(url)
        return response
    }
}
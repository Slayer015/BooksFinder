package com.mariokevin.booksfinder.data.network

import com.mariokevin.booksfinder.core.RetrofitHelper
import com.mariokevin.booksfinder.data.model.VolumesSearchModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class VolumeService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getVolumes(url: String): List<VolumesSearchModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(VolumeApiClient::class.java).getVolumesByName(url)
            response.body() ?: emptyList()
        }

    }
}
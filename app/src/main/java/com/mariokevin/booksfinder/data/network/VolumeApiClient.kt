package com.mariokevin.booksfinder.data.network

import com.mariokevin.booksfinder.data.model.VolumesSearchModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface VolumeApiClient {
    @GET
    fun getVolumesByName(@Url url:String):Response<List<VolumesSearchModel>>
}
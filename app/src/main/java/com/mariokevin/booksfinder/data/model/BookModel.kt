package com.mariokevin.booksfinder.data.model

data class BookModel(
    val kind: String,
    val id: String,
    val etag: String,
    val selfLink: String,
    val volumeInfo: List<VolumeInfoModel>,
    val saleInfo: List<SaleInfoModel>,
    val accessInfo: List<AccessInfoModel>,
    val searchInfo: List<SearchInfoModel>
)
package com.mariokevin.booksfinder.data.model

data class VolumesSearchModel(
    val kind: String,
    val totalItems: Int,
    val items: List<BookModel>
)
package com.mariokevin.booksfinder.data.model

data class AccessInfoModel(
    val country: String,
    val viewability: String,
    val embeddable: Boolean,
    val publicDomain: Boolean,
    val textToSpeechPermission: String,
    val epub: List<EpubModel>,
    val pdf: List<PdfModel>,
    val webReaderLink: String,
    val accessViewStatus: String,
    val quoteSharingAllowed: Boolean
)

data class PdfModel(
    val isAvailable: Boolean,
    val acsTokenLink: String
)

data class EpubModel(
    val isAvailable: Boolean
)

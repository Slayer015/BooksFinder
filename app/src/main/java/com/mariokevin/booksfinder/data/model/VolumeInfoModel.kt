package com.mariokevin.booksfinder.data.model

data class VolumeInfoModel(
    val title: String,
    val subtitle: String,
    val authors: List<String>,
    val publisher: String,
    val publishedDate: String,
    val description: String,
    val industryIdentifiersval: List<IndustryIdentifiersModel>,
    val readingModes: List<ReadingModesModel>,
    val pageCount: Int,
    val printType: String,
    val categories: List<String>,
    val averageRating: Float,
    val ratingsCount: Int,
    val maturityRating: String,
    val allowAnonLogging: Boolean,
    val contentVersion: String,
    val panelizationSummary: List<PanelizationSummaryModel>,
    val imageLinks: List<ImageLinksModel>,
    val language: String,
    val previewLink: String,
    val infoLink: String,
    val canonicalVolumeLink: String
)

data class ImageLinksModel(
    val smallThumbnail: String,
    val thumbnail: String
)

data class PanelizationSummaryModel(
    val containsEpubBubbles: Boolean,
    val containsImageBubbles: Boolean
)

data class ReadingModesModel(
    val text: Boolean,
    val image: Boolean
)

data class IndustryIdentifiersModel(
    val type: String,
    val identifier: String
)

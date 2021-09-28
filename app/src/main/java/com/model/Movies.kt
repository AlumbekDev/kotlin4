package com.model

data class Movies(
    val summary: String = "",
    val image: Image,
    val averageRuntime: Int = 0,
    val links: Links,
    val premiered: String = "",
    val rating: Rating,
    val runtime: Int = 0,
    val weight: Int = 0,
    val language: String = "",
    val type: String = "",
    val url: String = "",
    val officialSite: String = "",
    val network: Network,
    val schedule: Schedule,
    val genres: List<String>?,
    val name: String = "",
    val ended: String = "",
    val id: Int = 0,
    val externals: Externals,
    val updated: Int = 0,
    val status: String = ""
)
package io.github.shreyashsaitwal.rush.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RushYaml(
    val version: String,
    val license: String = "",
    val homepage: String = "",
    @SerialName("min_sdk") val minSdk: Int = 7,

    val assets: List<String> = listOf(),
    val authors: List<String> = listOf(),
)

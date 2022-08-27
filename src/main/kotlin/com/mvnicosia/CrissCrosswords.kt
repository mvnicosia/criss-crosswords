package com.mvnicosia

import java.io.File
import java.io.BufferedReader

import kotlinx.serialization.*
import kotlinx.serialization.json.*

fun main() {
  val bufferedReader: BufferedReader = File("src/main/resources/dictionary.json").bufferedReader()
  val dictionaryJson = bufferedReader.use { it.readText() }
  val dictionaryMap = Json.decodeFromString<Map<String, String>>(dictionaryJson)
  //println(dictionaryMap)
  println(dictionaryMap.get("marrubium"))
}

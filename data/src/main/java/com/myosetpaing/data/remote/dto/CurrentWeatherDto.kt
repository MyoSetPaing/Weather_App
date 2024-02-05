package com.myosetpaing.data.remote.dto

data class CurrentWeatherDto(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val rain: Rain?,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<WeatherRemote>,
    val wind: Wind
)
data class Wind(
    val deg: Int,
    val gust: Double,
    val speed: Double
)
data class Clouds(
    val all: Int
)

data class Coord(
    val lat: Double,
    val lon: Double
)

data class Main(
    val feels_like: Double,
    val grnd_level: Int,
    val humidity: Int,
    val pressure: Int,
    val sea_level: Int,
    val temp: Double,
    val temp_max: Double,
    val temp_min: Double
)

data class Rain(
    val `1h`: Double
)

data class Sys(
    val country: String,
    val id: Int,
    val sunrise: Int,
    val sunset: Int,
    val type: Int
)

data class WeatherRemote(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)

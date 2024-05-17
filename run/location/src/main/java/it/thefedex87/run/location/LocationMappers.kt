package it.thefedex87.run.location

import android.location.Location
import it.thefedex87.core.domain.location.LocationWithAltitude

fun Location.toLocationWithAltitude(): LocationWithAltitude {
    return LocationWithAltitude(
        location = it.thefedex87.core.domain.location.Location(
            lat =  latitude,
            long = longitude
        ),
        altitude = altitude
    )
}
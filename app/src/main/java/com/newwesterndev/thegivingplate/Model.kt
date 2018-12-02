package com.newwesterndev.thegivingplate

import android.location.Location

object Model {
    data class plate(val uuid: String, val location: Location)
}
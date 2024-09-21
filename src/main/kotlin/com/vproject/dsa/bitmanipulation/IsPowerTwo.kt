package com.vproject.dsa.bitmanipulation

internal fun Int.isPowerTwo() = this > 0 && this and (this - 1) == 0
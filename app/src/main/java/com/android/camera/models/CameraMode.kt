/*
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.camera.models

enum class CameraMode(
    val supportedFlashModes: Set<FlashMode>,
) {
    PHOTO(
        setOf(
            FlashMode.OFF,
            FlashMode.AUTO,
            FlashMode.ON,
            FlashMode.SCREEN,
        ),
    ),
    VIDEO(
        setOf(
            FlashMode.OFF,
            FlashMode.TORCH,
        ),
    ),
    QR(
        setOf(
            FlashMode.OFF,
            FlashMode.TORCH,
        ),
    ),
}

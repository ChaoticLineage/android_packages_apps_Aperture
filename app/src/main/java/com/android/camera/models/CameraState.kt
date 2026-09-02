/*
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.camera.models

enum class CameraState(
    val isRecordingVideo: Boolean = false,
) {
    IDLE,
    COUNTDOWN,
    TAKING_PHOTO,
    PRE_RECORDING_VIDEO,
    RECORDING_VIDEO(true),
    RECORDING_VIDEO_PAUSED(true),
}

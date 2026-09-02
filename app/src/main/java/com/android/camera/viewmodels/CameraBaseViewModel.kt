/*
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.camera.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.android.camera.CameraApplication

/**
 * Base view model for all app view models.
 */
abstract class CameraBaseViewModel(application: Application) : AndroidViewModel(application) {
    private val cameraApplication = getApplication<CameraApplication>()

    protected val cameraRepository = cameraApplication.cameraRepository
    protected val mediaRepository = cameraApplication.mediaRepository
    protected val overlaysRepository = cameraApplication.overlaysRepository
    protected val preferencesRepository = cameraApplication.preferencesRepository

    @Suppress("EmptyMethod")
    final override fun <T : Application> getApplication() = super.getApplication<T>()
}

/*
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.camera.ui.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.android.camera.models.UniqueItem

class UniqueItemDiffCallback<T : UniqueItem<T>> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T) = oldItem.areItemsTheSame(newItem)

    override fun areContentsTheSame(oldItem: T, newItem: T) = oldItem.areContentsTheSame(newItem)
}

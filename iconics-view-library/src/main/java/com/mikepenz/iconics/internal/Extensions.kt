/*
 * Copyright 2019 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mikepenz.iconics.internal

import android.view.View
import com.mikepenz.iconics.IconicsDrawable
import com.mikepenz.iconics.animation.IconicsAnimatedDrawable

internal fun View.tryToEnableIconicsAnimation(drawable: IconicsDrawable?): IconicsDrawable? {
    if (drawable == null) return null
    if (drawable is IconicsAnimatedDrawable) {
        drawable.animateIn(this)
    }
    return drawable
}

internal fun View.tryToEnableIconicsAnimation(vararg drawables: IconicsDrawable?) {
    drawables.mapNotNull { (it as? IconicsAnimatedDrawable) }.forEach { it.animateIn(this) }
}
/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea

import com.intellij.ide.highlighter.ArchiveFileType

object KLibFileType : ArchiveFileType() {

    override fun getName(): String = "KLib"

    override fun getDefaultExtension(): String = "klib"
}
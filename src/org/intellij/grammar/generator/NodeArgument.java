/*
 * Copyright 2011-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */
package org.intellij.grammar.generator;

import org.jetbrains.annotations.NotNull;

public interface NodeArgument {

  default boolean referencesMetaParameter() {
    return false;
  }

  @NotNull
  String render();
}

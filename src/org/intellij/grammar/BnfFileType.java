/*
 * Copyright 2011-present Greg Shrago
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.grammar;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: gregory
 * Date: 13.07.11
 * Time: 22:46
 */
public class BnfFileType extends LanguageFileType {

  public static final BnfFileType INSTANCE = new BnfFileType();

  protected BnfFileType() {
    super(BnfLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "BNF";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "BNF Grammar";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "bnf";
  }

  @Override
  public Icon getIcon() {
    return BnfIcons.FILE;
  }

  @Override
  public boolean isJVMDebuggingSupported() {
    // turn off for now
    return false;
  }
}

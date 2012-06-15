/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.aria.client;
/////////////////////////////////////////////////////////
// This is auto-generated code.  Do not manually edit! //
/////////////////////////////////////////////////////////

import com.google.gwt.aria.client.CommonAttributeTypes.AriaAttributeType;

/**
 * Token type enums for State ARIA attributes
 */
public final class StateTokenTypes {
  /**
   * InvalidToken enum type
   */
  public static enum InvalidToken implements AriaAttributeType {
    GRAMMAR("grammar"), FALSE("false"), SPELLING("spelling"), TRUE("true");

    private final String value;

    private InvalidToken(String value) {
      this.value = value;
    }

    @Override
    public String getAriaValue() {
      return value;
    }
  }
}
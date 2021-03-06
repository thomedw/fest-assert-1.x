/*
 * Created on Oct 3, 2009
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2009-2013 the original author or authors.
 */
package org.fest.assertions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Tests for {@link Formatting#valueOf(Description)}.
 *
 * @author Alex Ruiz
 */
public class Formatting_valueOf_Test {
  @Test
  public void should_return_null_if_Description_is_null() {
    assertNull(Formatting.valueOf(null));
  }

  @Test
  public void should_return_String_value_of_Description() {
    Description description = new BasicDescription("Hello World!");
    assertEquals("Hello World!", Formatting.valueOf(description));
  }
}

/*
 * Created on Jun 2, 2010
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
 * Copyright @2010-2013 the original author or authors.
 */
package org.fest.assertions;

import org.fest.test.ExpectedException;
import org.junit.Rule;
import org.junit.Test;

import static org.fest.test.ExpectedException.none;
import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link PropertySupport#firstPropertyIfNested(String)}.
 *
 * @author Joel Costigliola
 * @author Alex Ruiz
 */
public class PropertySupport_firstPropertyIfNested_withInvalidInput_Test {
  @Rule
  public ExpectedException thrown = none();

  @Test
  public void should_return_given_property_if_not_a_nested_property() {
    assertEquals("name", PropertySupport.instance().firstPropertyIfNested("name"));
  }

  @Test
  public void should_throw_error_if_property_is_null() {
    thrown.expect(NullPointerException.class);
    PropertySupport.instance().firstPropertyIfNested(null);
  }
}

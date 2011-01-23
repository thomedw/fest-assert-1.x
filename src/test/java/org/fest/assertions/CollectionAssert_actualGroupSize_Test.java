/*
 * Created on Jan 12, 2011
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
 * Copyright @2011 the original author or authors.
 */
package org.fest.assertions;

import static org.fest.util.Collections.list;
import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for <code>{@link CollectionAssert#actualGroupSize()}</code>
 *
 * @author Alex Ruiz
 */
public class CollectionAssert_actualGroupSize_Test {

  private static CollectionAssert assertions;

  @BeforeClass public static void setUpOnce() {
    Collection<?> actual = list("Luke", "Yoda", "Leia");
    assertions = new CollectionAssert(actual);
  }

  @Test public void should_return_size_of_actual() {
    assertEquals(3, assertions.actualGroupSize());
  }
}

/*
 * Created on Feb 14, 2008
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
 * Copyright @2008-2013 the original author or authors.
 */
package org.fest.assertions;

import org.junit.BeforeClass;

import static org.fest.assertions.ArrayFactory.shortArray;

/**
 * Tests for {@link ShortArrayAssert#isEqualTo(short[])}.
 *
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class ShortArrayAssert_isEqualTo_Test extends GenericAssert_isEqualTo_TestCase<ShortArrayAssert, short[]> {
  private static short[] notNullValue;
  private static short[] unequalValue;

  @BeforeClass
  public static void setUpOnce() {
    notNullValue = shortArray(6, 8);
    unequalValue = shortArray(6);
  }

  @Override
  protected ShortArrayAssert assertionsFor(short[] actual) {
    return new ShortArrayAssert(actual);
  }

  @Override
  protected short[] notNullValue() {
    return notNullValue;
  }

  @Override
  protected short[] notEqualValue() {
    return unequalValue;
  }
}

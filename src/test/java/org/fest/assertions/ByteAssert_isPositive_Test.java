/*
 * Created on Jun 18, 2007
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
 * Copyright @2007-2013 the original author or authors.
 */
package org.fest.assertions;

import org.fest.test.ExpectedException;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import static org.fest.test.ExpectedException.none;

/**
 * Tests for {@link ByteAssert#isPositive()}.
 *
 * @author Yvonne Wang
 * @author David DIDIER
 */
public class ByteAssert_isPositive_Test implements NumberAssert_isPositive_TestCase {
  @Rule
  public ExpectedException thrown = none();

  private static byte negative;
  private static byte zero;

  @BeforeClass
  public static void setUpOnce() {
    negative = -6;
    zero = 0;
  }

  @Override
  @Test
  public void should_pass_if_actual_is_positive() {
    new ByteAssert(6).isPositive();
  }

  @Override
  @Test
  public void should_fail_if_actual_is_negative() {
    thrown.expect(AssertionError.class, "actual value:<-6> should be greater than:<0>");
    new ByteAssert(negative).isPositive();
  }

  @Override
  @Test
  public void should_fail_and_display_description_if_actual_is_negative() {
    thrown.expect(AssertionError.class, "[A Test] actual value:<-6> should be greater than:<0>");
    new ByteAssert(negative).as("A Test").isPositive();
  }

  @Override
  @Test
  public void should_fail_with_custom_message_if_actual_is_negative() {
    thrown.expect(AssertionError.class, "My custom message");
    new ByteAssert(negative).overridingErrorMessage("My custom message").isPositive();
  }

  @Override
  @Test
  public void should_fail_with_custom_message_ignoring_description_if_actual_is_negative() {
    thrown.expect(AssertionError.class, "My custom message");
    new ByteAssert(negative).as("A Test").overridingErrorMessage("My custom message").isPositive();
  }

  @Override
  @Test
  public void should_fail_if_actual_is_zero() {
    thrown.expect(AssertionError.class, "actual value:<0> should be greater than:<0>");
    new ByteAssert(zero).isPositive();
  }

  @Override
  @Test
  public void should_fail_and_display_description_if_actual_is_zero() {
    thrown.expect(AssertionError.class, "[A Test] actual value:<0> should be greater than:<0>");
    new ByteAssert(zero).as("A Test").isPositive();
  }

  @Override
  @Test
  public void should_fail_with_custom_message_if_actual_is_zero() {
    thrown.expect(AssertionError.class, "My custom message");
    new ByteAssert(zero).as("A Test").overridingErrorMessage("My custom message").isPositive();
  }

  @Override
  @Test
  public void should_fail_with_custom_message_ignoring_description_if_actual_is_zero() {
    thrown.expect(AssertionError.class, "My custom message");
    new ByteAssert(zero).as("A Test").overridingErrorMessage("My custom message").isPositive();
  }
}

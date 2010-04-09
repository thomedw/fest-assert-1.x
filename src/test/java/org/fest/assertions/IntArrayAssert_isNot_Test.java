/*
 * Created on Oct 7, 2009
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
 * Copyright @2009 the original author or authors.
 */
package org.fest.assertions;

import static org.fest.assertions.CommonFailures.*;
import static org.fest.assertions.EmptyArrays.emptyIntArray;
import static org.fest.assertions.NotNull.notNullIntArray;
import static org.fest.test.ExpectedFailure.expectAssertionError;

import org.fest.test.CodeToTest;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for <code>{@link IntArrayAssert#isNot(Condition)}</code>.
 *
 * @author Alex Ruiz
 */
public class IntArrayAssert_isNot_Test implements GenericAssert_doesNotSatisfy_TestCase {

  private static int[] array;

  @BeforeClass
  public static void setUpOnce() {
    array = emptyIntArray();
  }

  @Test
  public void should_pass_if_condition_is_not_satisfied() {
    new IntArrayAssert(null).isNot(notNullIntArray());
  }

  @Test
  public void should_throw_error_if_condition_is_null() {
    expectErrorIfConditionIsNull().on(new CodeToTest() {
      public void run() {
        new IntArrayAssert(array).isNot(null);
      }
    });
  }

  @Test
  public void should_fail_if_condition_is_satisfied() {
    expectAssertionError("actual value:<[]> should not be:<NotNull>").on(new CodeToTest() {
      public void run() {
        new IntArrayAssert(array).isNot(notNullIntArray());
      }
    });
  }

  @Test
  public void should_fail_and_display_description_of_assertion_if_condition_is_satisfied() {
    expectAssertionError("[A Test] actual value:<[]> should not be:<NotNull>").on(new CodeToTest() {
      public void run() {
        new IntArrayAssert(array).as("A Test")
                                 .isNot(notNullIntArray());
      }
    });
  }

  @Test
  public void should_fail_and_display_description_of_condition_if_condition_is_satisfied() {
    expectAssertionError("actual value:<[]> should not be:<Not Null>").on(new CodeToTest() {
      public void run() {
        new IntArrayAssert(array).isNot(notNullIntArray().as("Not Null"));
      }
    });
  }

  @Test
  public void should_fail_and_display_descriptions_of_assertion_and_condition_if_condition_is_satisfied() {
    expectAssertionError("[A Test] actual value:<[]> should not be:<Not Null>").on(new CodeToTest() {
      public void run() {
        new IntArrayAssert(array).as("A Test")
                                 .isNot(notNullIntArray().as("Not Null"));
      }
    });
  }

  @Test
  public void should_fail_with_custom_message_if_condition_is_satisfied() {
    expectAssertionError("My custom message").on(new CodeToTest() {
      public void run() {
        new IntArrayAssert(array).overridingErrorMessage("My custom message")
                                 .isNot(notNullIntArray());
      }
    });
  }

  @Test
  public void should_fail_with_custom_message_ignoring_description_of_assertion_if_condition_is_satisfied() {
    expectAssertionError("My custom message").on(new CodeToTest() {
      public void run() {
        new IntArrayAssert(array).as("A Test")
                                 .overridingErrorMessage("My custom message")
                                 .isNot(notNullIntArray());
      }
    });
  }

  @Test
  public void should_fail_with_custom_message_ignoring_description_of_condition_if_condition_is_satisfied() {
    expectAssertionError("My custom message").on(new CodeToTest() {
      public void run() {
        new IntArrayAssert(array).overridingErrorMessage("My custom message")
                                 .isNot(notNullIntArray().as("Not Null"));
      }
    });
  }
}
/**
 * Copyright (c) 2010-2015 Mark Allen, Norbert Bartels.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.restfb.types;

import com.restfb.AbstractJsonMapperTests;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class HoursTest extends AbstractJsonMapperTests {

  @Test
  public void checkMon1Open() {
    Page page = createJsonMapper().toJavaObject(jsonFromClasspath("v2_3/page-hours"), Page.class);
    assertEquals("11:00", page.getHours().getMonday1open());
  }

  @Test
  public void checkMon1Close() {
    Page page = createJsonMapper().toJavaObject(jsonFromClasspath("v2_3/page-hours"), Page.class);
    assertEquals("18:30", page.getHours().getMonday1close());
  }

  @Test
  public void checkSun1Open() {
    Page page = createJsonMapper().toJavaObject(jsonFromClasspath("v2_3/page-hours"), Page.class);
    assertEquals("12:00", page.getHours().getSunday1open());
  }

  @Test
  public void checkSun1Close() {
    Page page = createJsonMapper().toJavaObject(jsonFromClasspath("v2_3/page-hours"), Page.class);
    assertEquals("17:00", page.getHours().getSunday1close());
  }

  @Test
  public void checkSun2Open() {
    Page page = createJsonMapper().toJavaObject(jsonFromClasspath("v2_3/page-hours"), Page.class);
    assertEquals("19:00", page.getHours().getSunday2open());
  }

  @Test
  public void checkSun2Close() {
    Page page = createJsonMapper().toJavaObject(jsonFromClasspath("v2_3/page-hours"), Page.class);
    assertEquals("20:00", page.getHours().getSunday2close());
  }


}

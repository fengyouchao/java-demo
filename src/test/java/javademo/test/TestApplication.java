package javademo.test;

import javademo.Application;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 2018/3/7.
 */
public class TestApplication {

  @Test
  public void testHello() {
    Assert.assertEquals("Hello", new Application().hello());
  }

}

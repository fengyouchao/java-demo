package javademo;

import com.google.common.collect.Lists;
import java.util.List;

/**
 * Created on 2018/3/7.
 */
public class Application {

  public static void main(String[] args) {
    List<String> list = Lists.newArrayList();
    System.out.println(new Application().hello());
  }

  public String hello() {
    return "Hello";
  }

}

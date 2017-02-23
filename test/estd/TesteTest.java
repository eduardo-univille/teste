package estd;

import org.junit.Assert;
import org.junit.Test;

public class TesteTest {
  @Test
  public void funcTest() {
    Teste t = new Teste();
    Assert.assertEquals(0, t.func());
  }
}

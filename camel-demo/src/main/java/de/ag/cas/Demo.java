// camel-k: language=java

import org.apache.camel.builder.RouteBuilder;

public class Demo extends RouteBuilder {
  @Override
  public void configure() throws Exception {
      from("timer:camel-demo?period=1000")
        .setBody()
          .constant("");
  }
}

package example;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        from("sjms2:queue:YOUR_OAQ?transacted=true&transactionBatchCount=10")
                .to("log:output?level=INFO");
    }

}

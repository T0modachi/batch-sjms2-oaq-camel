package example;

import javax.jms.JMSException;
import javax.jms.XAQueueConnectionFactory;
import oracle.jms.AQjmsFactory;
import org.apache.camel.component.sjms2.Sjms2Component;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;


/**
 * A Camel Application
 */
public class MainApp {

    public static void main(String... args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        Sjms2Component sjmsComponent = new Sjms2Component();
        try {
            sjmsComponent.setConnectionFactory(getXAQueueConnectionFactory());
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
        context.addComponent("sjms2", sjmsComponent);
        context.addRoutes(new MyRouteBuilder());
        context.start();
   }
    
    static XAQueueConnectionFactory getXAQueueConnectionFactory() throws JMSException {
        return  AQjmsFactory.getXAQueueConnectionFactory("jdbc:oracle:thin:USER/PASS@DB_HOST:1521:DB",null);
    }

}


package org.mycompany;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;


@Component("prepareMailingNotificationProcessor")
public class PrepareMailingNotificationProcessor implements Processor {
    
    @Override
    public void process(Exchange exchange) throws Exception {
	Map<String, Object> map = new HashMap<>();
	// set required fields
	map.put("from", String.valueOf(exchange.getProperty("mailFrom")));
	map.put("to", String.valueOf(exchange.getProperty("mailTo")));
	map.put("subject", String.valueOf(exchange.getProperty("mailSubject")));
	map.put("template", String.valueOf(exchange.getProperty("mailTemplate")));

	
	// set optional fields
	map.put("Mensajes", String.valueOf(exchange.getIn().getHeader("Mensajes")));
	map.put("NombreServicio", String.valueOf(exchange.getIn().getHeader("NombreServicio")));
	map.put("Descripcion", String.valueOf(exchange.getIn().getHeader("DescripcionError")));
	
	exchange.getIn().setBody(map, Map.class);
    }
    
    
    
    
}

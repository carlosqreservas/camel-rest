package br.com.qreservas;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:foo?period=50000").
            setHeader(Exchange.HTTP_METHOD, constant("GET")).

                to("http4://us3.api.mailchimp.com/3.0?authMethod=Basic" +
                    "&authUsername='anystring'" +
                    "&authPassword='9f8c52d0e874dc8208ecd95b99417736-us3'").

                log("Retorno HTML > " + body());
    }
}

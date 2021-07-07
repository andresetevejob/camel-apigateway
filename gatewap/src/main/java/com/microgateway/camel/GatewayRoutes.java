package com.microgateway.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GatewayRoutes extends RouteBuilder {
    @Value("${camel.component.servlet.mapping.context-path}")
    String contextPath;

    @Override
    public void configure() throws Exception {
        CamelContext context = new DefaultCamelContext();

        restConfiguration()
                .contextPath(contextPath+"/*")
                .component("servlet")
                .enableCORS(true);

        rest().get("/products")
              .route()
              .serviceCall("product/api/v1/product");
    }
}

package com.movieapi.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "movies")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema movieSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MoviePort");
        wsdl11Definition.setLocationUri("/ws");  // Define la URL donde estará disponible el servicio
        wsdl11Definition.setTargetNamespace("http://www.service.com/movieapi/gen");  // Namespace
        wsdl11Definition.setSchema(movieSchema);  // Establece el esquema para el servicio SOAP
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema movieSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/movies.xsd"));
    }
}

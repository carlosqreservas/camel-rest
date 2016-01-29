package br.com.qreservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QsemApplication {


//	@Bean
//	public HttpConfiguration httpAuthMailChimp() {
//		HttpConfiguration configuration = new HttpConfiguration();
//		configuration.setAuthMethod(AuthMethod.Basic);
//		configuration.setAuthUsername("anystring");
//		configuration.setAuthPassword("9f8c52d0e874dc8208ecd95b99417736-us3");
//
//		return configuration;
//	}
//
//	@Bean
//	public HttpComponent http() {
//		HttpComponent httpComponent = new HttpComponent();
//		httpComponent.setCamelContext(new DefaultCamelContext());
//		httpComponent.setHttpConfiguration(httpAuthMailChimp());
//
//		return httpComponent;
//	}



	public static void main(String[] args) {
		SpringApplication.run(QsemApplication.class, args);
	}
}

package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YanniConfig {
	@Bean
	YannyWordProducer yannyWordProducer() {
		return new YannyWordProducer();
	}

}

package com.lom.MonitoringMasrketDNS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class MonitoringMasrketDnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoringMasrketDnsApplication.class, args);
	}

}

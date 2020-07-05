package dl.extra.details.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DlExtraDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DlExtraDetailsServiceApplication.class, args);
	}

}

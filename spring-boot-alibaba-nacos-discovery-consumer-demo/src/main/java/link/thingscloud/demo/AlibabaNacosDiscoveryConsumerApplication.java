package link.thingscloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhouhailin
 * @version 1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaNacosDiscoveryConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryConsumerApplication.class, args);
    }
}


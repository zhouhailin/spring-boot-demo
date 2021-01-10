package link.thingscloud.demo;

import link.thingscloud.dubbo.service.EchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author zhouhailin
 * @version 1.0.0
 */
@Service
public class DemoDubboConsumerNacosService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @DubboReference(version = "1.0.0")
    private EchoService echoService;

    @PostConstruct
    public void echo() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            try {
                log.warn(echoService.echo(serviceName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

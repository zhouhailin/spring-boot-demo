package link.thingscloud.demo;

import link.thingscloud.dubbo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author zhouhailin
 * @version 1.0.0
 */
@DubboService(version = "1.0.0")
public class DefaultDemoService implements DemoService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        log.info("sayHello : {}", name);
        return "Hello " + name + ", i am " + serviceName;
    }
}

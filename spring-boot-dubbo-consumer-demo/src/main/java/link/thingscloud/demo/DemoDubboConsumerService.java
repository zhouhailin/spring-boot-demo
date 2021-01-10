package link.thingscloud.demo;

import link.thingscloud.dubbo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Service
public class DemoDubboConsumerService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;


    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    @PostConstruct
    public void sayHello() {
        log.warn(demoService.sayHello(serviceName));
    }
}

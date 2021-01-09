package link.thingscloud.demo;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.listener.NamingEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author zhouhailin
 * @version 1.0.0
 */
@Slf4j
@Service
public class DemoNamingService {

    @NacosInjected
    private NamingService namingService;

    @PostConstruct
    public void subscribe() throws NacosException {
        namingService.subscribe("spring-boot-nacos-config-demo", event -> {
            System.out.println(((NamingEvent) event).getInstances());
        });
    }
}

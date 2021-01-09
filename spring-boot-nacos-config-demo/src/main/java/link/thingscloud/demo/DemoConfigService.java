package link.thingscloud.demo;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.common.Constants;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executor;

/**
 * @author zhouhailin
 * @version 1.0.0
 */
@Slf4j
@Service
public class DemoConfigService {

    @NacosInjected
    private ConfigService configService;
    @Value("${spring.application.name}")
    private String applicatinName;

    @PostConstruct
    public void todo1() throws NacosException {
        String example = configService.getConfig(applicatinName, Constants.DEFAULT_GROUP, 1000);
        System.out.println(example);
    }

    @PostConstruct
    public void todo2() throws NacosException {
        configService.addListener(applicatinName, Constants.DEFAULT_GROUP, new Listener() {
            @Override
            public Executor getExecutor() {
                return null;
            }

            @Override
            public void receiveConfigInfo(String configInfo) {
                System.out.println(configInfo);
            }
        });

        System.out.println(configService.getServerStatus());

    }
}

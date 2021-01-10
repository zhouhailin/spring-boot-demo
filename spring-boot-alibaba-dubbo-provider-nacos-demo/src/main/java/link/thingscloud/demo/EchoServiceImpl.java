package link.thingscloud.demo;

import link.thingscloud.dubbo.service.EchoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author zhouhailin
 * @version 1.0.0
 */
@DubboService(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String message) {
        System.out.println(message);
        return message;
    }
}

package link.thingscloud.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zhouhailin
 * @version 1.0.0
 */
//@FeignClient(name = "spring-boot-alibaba-nacos-discovery-provider-demo")
public interface EchoService {
    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);

}

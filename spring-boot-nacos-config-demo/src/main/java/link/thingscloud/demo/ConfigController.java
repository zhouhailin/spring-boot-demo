package link.thingscloud.demo;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhailin
 * @version 1.0.0
 */
@RestController
@RequestMapping("config")
public class ConfigController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @NacosValue(value = "${name}", autoRefreshed = true)
    private String name;
    @NacosValue(value = "${age:0}", autoRefreshed = true)
    private int age;

    @GetMapping(value = "/get")
    public boolean get() {
        return useLocalCache;
    }

    @GetMapping(value = "/getName")
    public String getName() {
        return name;
    }

    @GetMapping(value = "/getAge")
    public int getAge() {
        return age;
    }

}

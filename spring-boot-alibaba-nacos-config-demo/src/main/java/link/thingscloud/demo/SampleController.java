package link.thingscloud.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhailin
 * @version 1.0.0
 */
@RefreshScope
@RestController
@RequestMapping("/sample")
public class SampleController {

    @Value("${user.name:zz}")
    String userName;

    @Value("${user.age:25}")
    int age;

    @GetMapping("/getUserName")
    public String getUserName() {
        return userName;
    }

    @GetMapping("/getAge")
    public Integer getAge() {
        return age;
    }

}

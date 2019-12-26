package priv.just1984.dubbo.demo.consumer.configuration;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description:
 * @author: yixiezi1994@gmail.com
 * @date: 2019-12-26 15:17
 */
@Configuration
@EnableDubbo(scanBasePackages = "priv.just1984.dubbo.demo.consumer")
@PropertySource("classpath:/spring/dubbo-consumer.properties")
public class DubboConsumerApplication {
}

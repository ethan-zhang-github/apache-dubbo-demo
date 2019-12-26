package priv.just1984.dubbo.demo.provider.configuration;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description:
 * @author: yixiezi1994@gmail.com
 * @date: 2019-12-26 14:42
 */
@Configuration
@EnableDubbo(scanBasePackages = "priv.just1984.dubbo.demo.provider")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class DubboProviderConfiguration {
}

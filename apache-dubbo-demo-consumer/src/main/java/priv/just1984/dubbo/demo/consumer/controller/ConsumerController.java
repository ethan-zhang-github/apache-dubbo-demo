package priv.just1984.dubbo.demo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.just1984.dubbo.demo.api.service.DemoService;
import priv.just1984.dubbo.demo.api.vo.ReqVo;
import priv.just1984.dubbo.demo.api.vo.RespVo;

/**
 * @description:
 * @author: yixiezi1994@gmail.com
 * @date: 2019-12-26 15:19
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Reference
    private DemoService demoService;

    @PostMapping("invoke")
    public RespVo invoke(@RequestBody ReqVo reqVo) {
        return demoService.invoke(reqVo);
    }

}

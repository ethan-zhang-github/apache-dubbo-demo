package priv.just1984.dubbo.demo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import priv.just1984.dubbo.demo.api.service.DemoService;
import priv.just1984.dubbo.demo.api.vo.ReqVo;
import priv.just1984.dubbo.demo.api.vo.RespVo;

import java.time.Instant;

/**
 * @description:
 * @author: yixiezi1994@gmail.com
 * @date: 2019-12-26 14:45
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public RespVo invoke(ReqVo reqVo) {
        RespVo respVo = new RespVo();
        respVo.setId(reqVo.getId());
        respVo.setContent(reqVo.getContent());
        respVo.setInstant(Instant.now());
        return respVo;
    }

}

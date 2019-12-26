package priv.just1984.dubbo.demo.api.service;

import priv.just1984.dubbo.demo.api.vo.ReqVo;
import priv.just1984.dubbo.demo.api.vo.RespVo;

/**
 * @description:
 * @author: yixiezi1994@gmail.com
 * @date: 2019-12-26 10:59
 */
public interface DemoService {

    RespVo invoke(ReqVo reqVo);

}

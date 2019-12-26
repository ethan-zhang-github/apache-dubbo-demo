package priv.just1984.dubbo.demo.api.service;

import priv.just1984.dubbo.demo.api.vo.ReqVo;
import priv.just1984.dubbo.demo.api.vo.RespVo;

import java.util.concurrent.CompletableFuture;

/**
 * @description:
 * @author: yixiezi1994@gmail.com
 * @date: 2019-12-26 10:59
 */
public interface DemoService {

    RespVo invoke(ReqVo reqVo);

    default CompletableFuture<RespVo> invokeAsync(ReqVo reqVo) {
        return CompletableFuture.supplyAsync(() -> invoke(reqVo));
    }

}

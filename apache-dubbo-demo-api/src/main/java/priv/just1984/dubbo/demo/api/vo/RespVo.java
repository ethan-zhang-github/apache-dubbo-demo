package priv.just1984.dubbo.demo.api.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * @description:
 * @author: yixiezi1994@gmail.com
 * @date: 2019-12-26 11:01
 */
@Data
public class RespVo implements Serializable {

    private long id;

    private Instant instant;

    private String content;

}

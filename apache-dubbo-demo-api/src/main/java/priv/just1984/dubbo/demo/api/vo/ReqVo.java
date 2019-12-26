package priv.just1984.dubbo.demo.api.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: yixiezi1994@gmail.com
 * @date: 2019-12-26 11:01
 */
@Data
public class ReqVo implements Serializable {

    private long id;

    private String content;

}

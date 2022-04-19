package com.rt.generalframework.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * TODO(工具类).
 * <p>版权所有:Copyright (c) 2019<br/>
 * <a href="http://www.wiseimage.cn/">广州易联众睿图信息技术有限公司</a>.
 *
 * @author XMW
 * @version V1.0
 * @since 2022/4/19  14:02
 */
@Data
public class ScUtils {
    private Integer sid02;
    private Integer cid02;
    private BigDecimal score01;
    private BigDecimal score02;

    //平均分
    private BigDecimal avg;
    //选课总数
    private Integer courseTotal;
    //成绩总分
    private BigDecimal scoreTotal;

}

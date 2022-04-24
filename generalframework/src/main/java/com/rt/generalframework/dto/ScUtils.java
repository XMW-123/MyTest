package com.rt.generalframework.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.text.Bidi;

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

    //课程名
    private String cname;
    //平均分
    private BigDecimal avg;
    //选课总数
    private Integer courseTotal;
    //成绩总分
    private BigDecimal scoreTotal;
    //最高分
    private BigDecimal min;
    //最低分
    private BigDecimal max;
    //及格率
    private BigDecimal passrate;
    //中等率
    private BigDecimal mediumsrate;
    //优良率
    private BigDecimal excellentrate;
    //优秀率
    private BigDecimal finerate;
    //各科成绩排名
    private Integer rank;
    //总人数
    private Integer num;


    //分段人数1 segmentNumber '[60-0]'
    private Integer sNumber1;
    //分段百分比1 segmentPercentage '[60-0]百分比'
    private BigDecimal sPercentage1;
    //分段人数2 '[70-60]'
    private Integer sNumber2;
    //分段百分比2 '[70-60]百分比'
    private BigDecimal sPercentage2;
    //分段人数3 '[85-70]'
    private Integer sNumber3;
    //分段百分比3 '[85-70]百分比'
    private BigDecimal sPercentage3;
    //分段人数4 '[100-85]'
    private Integer sNumber4;
    //分段百分比4 '[100-85]百分比'
    private BigDecimal sPercentage4;

}

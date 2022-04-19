package com.rt.generalframework.entity;

import com.rt.generalframework.dto.ScUtils;
import lombok.Data;

import java.math.BigDecimal;

/**
 * TODO(学生实体类).
 * <p>版权所有:Copyright (c) 2019<br/>
 * <a href="http://www.wiseimage.cn/">广州易联众睿图信息技术有限公司</a>.
 *
 * @author XMW
 * @version V1.0
 * @since 2022/4/18  16:17
 */
@Data
public class Student {
    private Integer sid;
    private String sname;
    private String sage;
    private String ssex;

    private ScUtils scUtils;

}

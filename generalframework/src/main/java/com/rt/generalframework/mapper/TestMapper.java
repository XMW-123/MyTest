package com.rt.generalframework.mapper;

import com.rt.generalframework.entity.Sc;
import com.rt.generalframework.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TODO(mybatis接口类).
 * <p>版权所有:Copyright (c) 2019<br/>
 * <a href="http://www.wiseimage.cn/">广州易联众睿图信息技术有限公司</a>.
 *
 * @author XMW
 * @version V1.0
 * @since 2022/4/18  16:34
 */

@Mapper
public interface TestMapper {
    public List<Student> findScore();

    public List<Sc> findCid();

    public List<Sc> findCid02();

    public List<Sc> findCid03();

    public List<Student> findStudentAvg();

    public List<Student> findStudent();

    public List<Student> findCourseAndScoreTotal();

    public int findTeacherLi();

    public List<Student> findStudentByTeacher();

    public List<Student> findStudentNoLearnAll();
}

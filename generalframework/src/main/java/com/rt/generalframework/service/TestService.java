package com.rt.generalframework.service;

import com.rt.generalframework.entity.Sc;
import com.rt.generalframework.entity.Student;

import java.util.List;

/**
 * TODO(数据访问层).
 * <p>版权所有:Copyright (c) 2019<br/>
 * <a href="http://www.wiseimage.cn/">广州易联众睿图信息技术有限公司</a>.
 *
 * @author XMW
 * @version V1.0
 * @since 2022/4/18  16:36
 */
public interface TestService {
    List<Student> findScore();

    List<Sc> findCid();

    List<Sc> findCid02();

    List<Sc> findCid03();

    List<Student> findStudentAvg();

    List<Student> findStudent();

    List<Student> findCourseAndScoreTotal();

    int findTeacherLi();

    List<Student> findStudentByTeacher();

    List<Student> findStudentNoLearnAll();


}

package com.rt.generalframework.service.impl;

import com.rt.generalframework.entity.Sc;
import com.rt.generalframework.entity.Student;
import com.rt.generalframework.mapper.TestMapper;
import com.rt.generalframework.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO(逻辑业务层).
 * <p>版权所有:Copyright (c) 2019<br/>
 * <a href="http://www.wiseimage.cn/">广州易联众睿图信息技术有限公司</a>.
 *
 * @author XMW
 * @version V1.0
 * @since 2022/4/18  16:37
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired(required = false)
    private TestMapper testMapper;

    @Override
    public List<Student> findScore() {
        List<Student> list = testMapper.findScore();
        return list;
    }

    @Override
    public List<Sc> findCid() {
        List<Sc> list = testMapper.findCid();
        return list;
    }

    @Override
    public List<Sc> findCid02() {
        List<Sc> list = testMapper.findCid02();
        return list;
    }

    @Override
    public List<Sc> findCid03() {
        List<Sc> list = testMapper.findCid03();
        return list;
    }

    @Override
    public List<Student> findStudentAvg() {
        List<Student> list = testMapper.findStudentAvg();
        return list;
    }

    @Override
    public List<Student> findStudent() {
        List<Student> list = testMapper.findStudent();
        return list;
    }

    @Override
    public List<Student> findCourseAndScoreTotal() {
        List<Student> list = testMapper.findCourseAndScoreTotal();
        return list;
    }

    @Override
    public int findTeacherLi() {
        int sum = testMapper.findTeacherLi();
        return sum;
    }

    @Override
    public List<Student> findStudentByTeacher() {
        List<Student> list = testMapper.findStudentByTeacher();
        return list;
    }

    @Override
    public List<Student> findStudentNoLearnAll() {
        List<Student> list = testMapper.findStudentNoLearnAll();
        return list;
    }

}

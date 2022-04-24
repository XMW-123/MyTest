package com.rt.generalframework.service.impl;

import com.rt.generalframework.entity.Sc;
import com.rt.generalframework.entity.Student;
import com.rt.generalframework.mapper.TestMapper;
import com.rt.generalframework.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
    public List<Student> findScore(Integer cid1,Integer cid2) {
        List<Student> list = testMapper.findScore(cid1,cid2);
        return list;
    }

    @Override
    public List<Sc> findCid(Integer cid1,Integer cid2) {
        List<Sc> list = testMapper.findCid(cid1,cid2);
        return list;
    }

    @Override
    public List<Sc> findCid02(Integer cid1 ,Integer cid2) {
        List<Sc> list = testMapper.findCid02(cid1,cid2);
        return list;
    }

    @Override
    public List<Sc> findCid03(Integer cid1 ,Integer cid2) {
        List<Sc> list = testMapper.findCid03(cid1,cid2);
        return list;
    }

    @Override
    public List<Student> findStudentAvg(BigDecimal score) {
        List<Student> list = testMapper.findStudentAvg(score);
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
    public int findTeacherByName(String name) {
        int sum = testMapper.findTeacherByName(name);
        return sum;
    }

    @Override
    public List<Student> findStudentByTeacher(String name) {
        List<Student> list = testMapper.findStudentByTeacher(name);
        return list;
    }

    @Override
    public List<Student> findStudentNoLearnAll() {
        List<Student> list = testMapper.findStudentNoLearnAll();
        return list;
    }

    @Override
    public List<Student> findStudentBySid(Integer sid) {
        List<Student> list = testMapper.findStudentBySid(sid);
        return list;
    }

    @Override
    public List<Student> findStudentBySid02(Integer sid) {
        List<Student> list = testMapper.findStudentBySid02(sid);
        return list;
    }

    @Override
    public List<Student> findStudentByTeacher02(String name) {
        List<Student> list = testMapper.findStudentByTeacher02(name);
        return list;
    }

    @Override
    public List<Student> findStudentByScore(BigDecimal score,Integer number) {
        List<Student> list = testMapper.findStudentByScore(score,number);
        return list;
    }

    @Override
    public List<Student> findStudentByCidAndScore(Integer cid, BigDecimal score) {
        List<Student> list = testMapper.findStudentByCidAndScore(cid, score);
        return list;
    }

    @Override
    public List<Sc> findStudentOrderByAvg() {
        return testMapper.findStudentOrderByAvg();
    }

    @Override
    public List<Sc> findCoures() {
        List<Sc> list = testMapper.findCoures();
        return list;
    }

    @Override
    public List<Sc> findScoreOrderByCid() {
        List<Sc> list = testMapper.findScoreOrderByCid();
        return list;
    }

    @Override
    public List<Sc> findScoreOrderByCid02() {
        List<Sc> list = testMapper.findScoreOrderByCid02();
        return list;
    }

    @Override
    public List<Sc> findScoreOrderByCid03() {
        List<Sc> list = testMapper.findScoreOrderByCid03();
        return list;
    }

    @Override
    public List<Sc> findScore02() {
        List<Sc> list = testMapper.findScore02();
        return list;
    }

    @Override
    public List<Sc> findScore03(Integer number) {
        List<Sc> list = testMapper.findScore03(number);
        return list;
    }

    @Override
    public List<Sc> findCourseTotal() {
        List<Sc> list = testMapper.findCourseTotal();
        return list;
    }

    @Override
    public List<Student> findStudentByCourseTotal(Integer number) {
        List<Student> list = testMapper.findStudentByCourseTotal(number);
        return list;
    }

    @Override
    public List<Student> findNumBySsex() {
        List<Student> list = testMapper.findNumBySsex();
        return list;
    }

    @Override
    public List<Student> findStudentBySname(String name) {
        List<Student> list = testMapper.findStudentBySname(name);
        return list;
    }

    @Override
    public List<Student> findStudentBySnameAndSsex(){
        List<Student> list = testMapper.findStudentBySnameAndSsex();
        return list;
    }

    @Override
    public List<Student> findStudentBySage(String age) {
        List<Student> list = testMapper.findStudentBySage(age);
        return list;
    }

    @Override
    public List<Sc> findScOrderByAvgAndCid() {
        List<Sc> list = testMapper.findScOrderByAvgAndCid();
        return list;
    }

    @Override
    public List<Student> findStudentByScore02(BigDecimal score) {
        List<Student> list = testMapper.findStudentByScore02(score);
        return list;
    }

    @Override
    public List<Student> findStudentByCnameAndScore(BigDecimal score, String name) {
        List<Student> list = testMapper.findStudentByCnameAndScore(score, name);
        return list;
    }

    @Override
    public List<Student> findStudentAndScore() {
        List<Student> list = testMapper.findStudentAndScore();
        return list;
    }

    @Override
    public List<Student> findStudentByScore03(BigDecimal score) {
        List<Student> list = testMapper.findStudentByScore03(score);
        return list;
    }

    @Override
    public List<Sc> findScoreOrderByCid04() {
        List<Sc> list = testMapper.findScoreOrderByCid04();
        return list;
    }

    @Override
    public List<Sc> findCidByScore(BigDecimal score) {
        List<Sc> list = testMapper.findCidByScore(score);
        return list;
    }

    @Override
    public List<Student> findStudentByCidAndScore02(Integer cid, BigDecimal score) {
        List<Student> list = testMapper.findStudentByCidAndScore02(cid, score);
        return list;
    }

    @Override
    public List<Sc> findCidAndNum(Integer num) {
        List<Sc> list = testMapper.findCidAndNum(num);
        return list;
    }

    @Override
    public List<Student> findMaxScoreByTname(String name) {
        List<Student> list = testMapper.findMaxScoreByTname(name);
        return list;
    }

    @Override
    public List<Student> findMaxScoreByTname02(String name) {
        List<Student> list = testMapper.findMaxScoreByTname02(name);
        return list;
    }

    @Override
    public List<Sc> findStudentByScoreAndCid() {
        List<Sc> list = testMapper.findStudentByScoreAndCid();
        return list;
    }

    @Override
    public List<Sc> findScoreOrderByCid05(Integer number) {
        List<Sc> list = testMapper.findScoreOrderByCid05(number);
        return list;
    }

    @Override
    public List<Student> findStudentByCourseTotal02(Integer number) {
        List<Student> list = testMapper.findStudentByCourseTotal02(number);
        return list;
    }

    @Override
    public List<Student> findStudentByCourse() {
        List<Student> list = testMapper.findStudentByCourse();
        return list;
    }

    @Override
    public List<Student> findStudentAndSage() {
        List<Student> list = testMapper.findStudentAndSage();
        return list;
    }

    @Override
    public List<Student> findStudentAndSage02() {
        List<Student> list = testMapper.findStudentAndSage02();
        return list;
    }

    @Override
    public List<Student> findStudentByBirthday() {
        List<Student> list = testMapper.findStudentByBirthday();
        return list;
    }

    @Override
    public List<Student> findStudentByBirthday02() {
        List<Student> list = testMapper.findStudentByBirthday02();
        return list;
    }

    @Override
    public List<Student> findStudentByBirthday03() {
        List<Student> list = testMapper.findStudentByBirthday03();
        return list;
    }

    @Override
    public List<Student> findStudentByBirthday04() {
        List<Student> list = testMapper.findStudentByBirthday04();
        return list;
    }
}

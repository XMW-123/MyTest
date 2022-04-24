package com.rt.generalframework.service;

import com.rt.generalframework.entity.Sc;
import com.rt.generalframework.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
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
    List<Student> findScore(Integer cid1,Integer cid2);

    List<Sc> findCid(Integer cid1,Integer cid2);

    List<Sc> findCid02(Integer cid1, Integer cid2);

    List<Sc> findCid03(Integer cid1, Integer cid2);

    List<Student> findStudentAvg(BigDecimal score);

    List<Student> findStudent();

    List<Student> findCourseAndScoreTotal();

    int findTeacherByName(String name);

    List<Student> findStudentByTeacher(String name);

    List<Student> findStudentNoLearnAll();

    List<Student> findStudentBySid(Integer sid);

    List<Student> findStudentBySid02(Integer sid);

    List<Student> findStudentByTeacher02(String name);

    List<Student> findStudentByScore(BigDecimal score,Integer number);

    List<Student> findStudentByCidAndScore(Integer cid, BigDecimal score);

    List<Sc> findStudentOrderByAvg();

    List<Sc> findCoures();

    List<Sc> findScoreOrderByCid();

    List<Sc> findScoreOrderByCid02();

    List<Sc> findScoreOrderByCid03();

    List<Sc> findScore02();

    List<Sc> findScore03(Integer number);

    List<Sc> findCourseTotal();

    List<Student> findStudentByCourseTotal(Integer number);

    List<Student> findNumBySsex();

    List<Student> findStudentBySname(String name);

    List<Student> findStudentBySnameAndSsex();

    List<Student> findStudentBySage(String age);

    List<Sc> findScOrderByAvgAndCid();

    List<Student> findStudentByScore02(BigDecimal score);

    List<Student> findStudentByCnameAndScore(BigDecimal score,String name);

    List<Student> findStudentAndScore();

    List<Student> findStudentByScore03(BigDecimal score);

    List<Sc> findScoreOrderByCid04();

    List<Sc> findCidByScore(BigDecimal score);

    List<Student> findStudentByCidAndScore02(Integer cid, BigDecimal score);

    List<Sc> findCidAndNum(Integer num);

    List<Student> findMaxScoreByTname(String name);

    List<Student> findMaxScoreByTname02(String name);

    List<Sc> findStudentByScoreAndCid();

    List<Sc> findScoreOrderByCid05(Integer number);

    List<Student> findStudentByCourseTotal02(Integer number);

    List<Student> findStudentByCourse();

    List<Student> findStudentAndSage();

    List<Student> findStudentAndSage02();

    List<Student> findStudentByBirthday();

    List<Student> findStudentByBirthday02();

    List<Student> findStudentByBirthday03();

    List<Student> findStudentByBirthday04();


}

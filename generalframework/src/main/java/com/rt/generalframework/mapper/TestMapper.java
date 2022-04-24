package com.rt.generalframework.mapper;

import com.rt.generalframework.entity.Sc;
import com.rt.generalframework.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
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
public interface TestMapper {

    public List<Student> findScore(@Param("cid1") Integer cid1,@Param("cid2") Integer cid2);

    public List<Sc> findCid(@Param("cid1") Integer cid1,@Param("cid2") Integer cid2);

    public List<Sc> findCid02(@Param("cid1") Integer cid1,@Param("cid2") Integer cid2);

    public List<Sc> findCid03(@Param("cid1") Integer cid1,@Param("cid2") Integer cid2);

    public List<Student> findStudentAvg(@Param("score") BigDecimal score);

    public List<Student> findStudent();

    public List<Student> findCourseAndScoreTotal();

    public int findTeacherByName(@Param("name") String name);

    public List<Student> findStudentByTeacher(@Param("name") String name);

    public List<Student> findStudentNoLearnAll();

    public List<Student> findStudentBySid(@Param("sid") Integer sid);

    public List<Student> findStudentBySid02(@Param("sid") Integer sid);

    public List<Student> findStudentByTeacher02(@Param("name") String name);

    public List<Student> findStudentByScore(@Param("score") BigDecimal score ,@Param("number") Integer number);

    public List<Student> findStudentByCidAndScore(@Param("cid") Integer cid, @Param("score") BigDecimal score);

    public List<Sc> findStudentOrderByAvg();

    public List<Sc> findCoures();

    public List<Sc> findScoreOrderByCid();

    public List<Sc> findScoreOrderByCid02();

    public List<Sc> findScoreOrderByCid03();

    public List<Sc> findScore02();

    public List<Sc> findScore03(@Param("number") Integer number);

    public List<Sc> findCourseTotal();

    public List<Student> findStudentByCourseTotal(@Param("number") Integer number);

    public List<Student> findNumBySsex();

    public List<Student> findStudentBySname(@Param("name") String name);

    public List<Student> findStudentBySnameAndSsex();

    public List<Student> findStudentBySage(@Param("age") String age);

    public List<Sc> findScOrderByAvgAndCid();

    public List<Student> findStudentByScore02(@Param("score") BigDecimal score);

    public List<Student> findStudentByCnameAndScore(@Param("score") BigDecimal score, @Param("name") String name);

    public List<Student> findStudentAndScore();

    public List<Student> findStudentByScore03(@Param("score") BigDecimal score);

    public List<Sc> findScoreOrderByCid04();

    public List<Sc> findCidByScore(@Param("score") BigDecimal score);

    public List<Student> findStudentByCidAndScore02(@Param("cid") Integer cid, @Param("score") BigDecimal score);

    public List<Sc> findCidAndNum(@Param("num") Integer num);


    public List<Student> findMaxScoreByTname(@Param("name") String name);

    public List<Student> findMaxScoreByTname02(@Param("name") String name);

    public List<Sc> findStudentByScoreAndCid();

    public List<Sc> findScoreOrderByCid05(@Param("number") Integer number);

    public List<Student> findStudentByCourseTotal02(@Param("number") Integer number);

    public List<Student> findStudentByCourse();

    public List<Student> findStudentAndSage();

    public List<Student> findStudentAndSage02();

    public List<Student> findStudentByBirthday();

    public List<Student> findStudentByBirthday02();

    public List<Student> findStudentByBirthday03();

    public List<Student> findStudentByBirthday04();


}

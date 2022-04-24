package com.rt.generalframework.web;

import com.rt.generalframework.entity.Sc;
import com.rt.generalframework.entity.Student;
import com.rt.generalframework.service.impl.TestServiceImpl;
import com.rt.global.JsonResult;
import com.rt.global.JsonResultUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * TODO(控制层).
 * <p>版权所有:Copyright (c) 2019<br/>
 * <a href="http://www.wiseimage.cn/">广州易联众睿图信息技术有限公司</a>.
 *
 * @author XMW
 * @version V1.0
 * @since 2022/4/18  16:41
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestServiceImpl testService;

    /**
     * TODO(1、查询"01"课程比"02"课程成绩高的学生的信息及课程分数).
     *
     * @param cid1
     * @param cid2
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  11:40
     */
    @RequestMapping("/findScore")
    public JsonResult findScore(@RequestParam(name = "cid1",defaultValue = "01") Integer cid1,Integer cid2){
        List<Student> list = testService.findScore(cid1,cid2);
        return JsonResultUtil.success(list);
    }

    @PostMapping("/findScore1")
    public JsonResult findScore(@RequestBody Map map, @RequestParam("cid1") Integer cid1){

        return JsonResultUtil.success(map);
    }
    /**
     * TODO(2、查询存在" 01 "课程但可能不存在" 02 "课程的情况).
     *
     * @param cid1
     * @param cid2
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  13:59
     */
    @RequestMapping("/findCid")
    public JsonResult findCid(Integer cid1 ,Integer cid2){
        List<Sc> list = testService.findCid(cid1,cid2);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(3、查询同时存在01和02课程的情况).
     *
     * @param cid1
     * @param cid2
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  14:36
     */
    @RequestMapping("/findCid02")
    public JsonResult findCid02(Integer cid1 ,Integer cid2){
        List<Sc> list = testService.findCid02(cid1,cid2);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(4、查询选择了02课程但没有01课程的情况).
     *
     * @param cid1
     * @param cid2
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  14:52
     */
    @RequestMapping("/findCid03")
    public JsonResult findCid03(Integer cid1,Integer cid2){
        List<Sc> list = testService.findCid03(cid1,cid2);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(5、查询平均成绩大于等于 60 分的同学的学生编号和学生姓名和平均成绩).
     *
     * @param score
     * @return com.rt.global.JsonResult  
     * @author XMW
     * @since 2022/4/19  15:35
     */
    @RequestMapping("/findStudentAvg")
    public JsonResult findStudentAvg(BigDecimal score){
        List<Student> list = testService.findStudentAvg(score);
        return JsonResultUtil.success(list);
    }
    
    /**
     * TODO(6、查询在 SC 表存在成绩的学生信息).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  15:37
     */
     @RequestMapping("/findStudent")
     public JsonResult findStudent() {
         List<Student> list = testService.findStudent();
         return JsonResultUtil.success(list);
     }

     /**
      * TODO(7、查询所有同学的学生编号、学生姓名、选课总数、所有课程的成绩总和).
      *
      * @return com.rt.global.JsonResult
      * @author XMW
      * @since 2022/4/19  16:09
      */
     @RequestMapping("/findCourseAndScoreTotal")
     public JsonResult findCourseAndScoreTotal() {
         List<Student> list = testService.findCourseAndScoreTotal();
         return JsonResultUtil.success(list);
     }

     /**
      * TODO(8、查询「李」姓老师的数量).
      *
      * @param name
      * @return com.rt.global.JsonResult
      * @author XMW
      * @since 2022/4/19  16:15
      */
    @RequestMapping("/findTeacherByName")
    public JsonResult findTeacherByName(String name) {
        int sum = testService.findTeacherByName(name);
        return JsonResultUtil.success(sum);
    }

    /**
     * TODO(9、查询学过「张三」老师授课的同学的信息).
     *
     * @param name
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  16:43
     */
    @RequestMapping("/findStudentByTeacher")
    public JsonResult findStudentByTeacher(String name) {
        List<Student> list = testService.findStudentByTeacher(name);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(10、查询没有学全所有课程的同学的信息).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  17:07
     */
    @RequestMapping("/findStudentNoLearnAll")
    public JsonResult findStudentNoLearnAll() {
        List<Student> list = testService.findStudentNoLearnAll();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(11、查询至少有一门课与学号为" 01 "的同学所学相同的同学的信息).
     *
     * @param sid
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/20  14:48
     */
    @RequestMapping(value = "/findStudentBySid",method = RequestMethod.POST)
    public JsonResult findStudentBySid(Integer sid) {
        List<Student> list = testService.findStudentBySid(sid);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(*12、查询和" 01 "号的同学学习的课程完全相同的其他同学的信息).
     *
     * @param sid
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/20  15:21
     */
    @RequestMapping("/findStudentBySid02")
    public JsonResult findStudentBySid02(Integer sid) {
        List<Student> list = testService.findStudentBySid02(sid);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(13、查询没学过"张三"老师讲授的任一门课程的学生姓名).
     *
     * @param name
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/20  15:44
     */
    @RequestMapping("/findStudentByTeacher02")
    public JsonResult findStudentByTeacher02(String name) {
        List<Student> list = testService.findStudentByTeacher02(name);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(*14、查询两门及其以上不及格课程的同学的学号，姓名及其平均成绩).
     *
     * @param score
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/20  16:21
     */
    @RequestMapping("/findStudentByScore")
    public JsonResult findStudentByScore(BigDecimal score,Integer number) {
        List<Student> list = testService.findStudentByScore(score,number);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(15、检索" 01 "课程分数小于 60，按分数降序排列的学生信息).
     *
     * @param cid
     * @param score
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/20  16:35
     */
    @RequestMapping("/findStudentByCidAndScore")
    public JsonResult findStudentByCidAndScore(Integer cid,BigDecimal score) {
        List<Student> list = testService.findStudentByCidAndScore(cid, score);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(16、按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩).
     *  
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/20  17:02
     */
    @RequestMapping("/findStudentOrderByAvg")
    public JsonResult findStudentOrderByAvg() {
        List<Sc> list = testService.findStudentOrderByAvg();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(17、查询各科成绩最高分、最低分和平均分).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  11:51
     */
    @RequestMapping("/findCoures")
    public JsonResult findCoures(){
        List<Sc> list = testService.findCoures();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(18、按各科成绩进行排序，并显示排名， Score 重复时保留名次空缺).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  14:01
     */
    @RequestMapping("/findScoreOrderByCid")
    public JsonResult findScoreOrderByCid(){
        List<Sc> list = testService.findScoreOrderByCid();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(19、按各科成绩进行行排序，并显示排名， Score 重复时合并名次).
     *  
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  14:08
     */
    @RequestMapping("/findScoreOrderByCid02")
    public JsonResult findScoreOrderByCid02(){
        List<Sc> list = testService.findScoreOrderByCid02();
        return JsonResultUtil.success(list);
    }


    /**
     * TODO(20、查询学生的总成绩，并进行排名，总分重复时保留名次空缺).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  14:51
     */
    @RequestMapping("/findScoreOrderByCid03")
    public JsonResult findScoreOrderByCid03(){
        List<Sc> list = testService.findScoreOrderByCid03();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(21、统计各科成绩各分数段人数：课程编号，课程名称，[100-85]，[85-70]，[70-60]，[60-0] 及所占百分比).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  15:05
     */
    @RequestMapping("/findScore02")
    public JsonResult findScore02(){
        List<Sc> list = testService.findScore02();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(22、查询各科成绩前三名的记录).
     *
     * @param number
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  16:02
     */
    @RequestMapping("/findScore03")
    public JsonResult findScore03(Integer number){
        List<Sc> list = testService.findScore03(number);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(23、查询每门课程被选修的学生数).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  16:11
     */
    @RequestMapping("/findCourseTotal")
    public JsonResult findCourseTotal(){
        List<Sc> list = testService.findCourseTotal();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(24、查询出只选修两门课程的学生学号和姓名).
     *
     * @param number
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  16:17
     */
    @RequestMapping("/findStudentByCourseTotal")
    public JsonResult findStudentByCourseTotal(Integer number){
        List<Student> list = testService.findStudentByCourseTotal(number);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(25、查询男生、女生人数).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  16:25
     */
    @RequestMapping("/findNumBySsex")
    public JsonResult findNumBySsex(){
        List<Student> list = testService.findNumBySsex();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(26、查询名字中含有「风」字的学生信息).
     *
     * @param name
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  16:33
     */
    @RequestMapping("/findStudentBySname")
    public JsonResult findStudentBySname(String name){
        List<Student> list = testService.findStudentBySname(name);
        return JsonResultUtil.success(list);
    }
    
    /**
     * TODO(*27、查询同名同性学生名单，并统计同名人数).
     *  
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  17:07
     */
    @RequestMapping("/findStudentBySnameAndSsex")
    public JsonResult findStudentBySnameAndSsex(){
        List<Student> list = testService.findStudentBySnameAndSsex();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(28、查询 1990 年出生的学生名单).
     *
     * @param age
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  17:14
     */
    @RequestMapping("/findStudentBySage")
    public JsonResult findStudentBySage(String age){
        List<Student> list = testService.findStudentBySage(age);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(29、查询每门课程的平均成绩，结果按平均成绩降序排列，平均成绩相同时，按课程编号升序排列).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  17:25
     */
    @RequestMapping("/findScOrderByAvgAndCid")
    public JsonResult findScOrderByAvgAndCid(){
        List<Sc> list = testService.findScOrderByAvgAndCid();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(30、查询平均成绩大于等于 85 的所有学生的学号、姓名和平均成绩).
     *
     * @param score
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/21  17:41
     */
    @RequestMapping("/findStudentByScore02")
    public JsonResult findStudentByScore02(BigDecimal score){
        List<Student> list = testService.findStudentByScore02(score);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(31、查询课程名称为「数学」，且分数低于 60 的学生姓名和分数).
     *
     * @param score
     * @param name
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  11:40
     */
    @RequestMapping("/findStudentByCnameAndScore")
    public JsonResult findStudentByCnameAndScore(BigDecimal score,String name){
        List<Student> list = testService.findStudentByCnameAndScore(score,name);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(*32、查询所有学生的课程及分数情况（存在学生没成绩，没选课的情况）).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  13:41
     */
    @RequestMapping("/findStudentAndScore")
    public JsonResult findStudentAndScore(){
        List<Student> list = testService.findStudentAndScore();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(33、查询任何一门课程成绩在 70 分以上的姓名、课程名称和分数).
     *
     * @param score
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  14:05
     */
    @RequestMapping("/findStudentByScore03")
    public JsonResult findStudentByScore03(BigDecimal score){
        List<Student> list = testService.findStudentByScore03(score);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(34、查询学生的总成绩，并进行排名，总分重复时不保留名次空缺).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  14:20
     */
    @RequestMapping("/findScoreOrderByCid04")
    public JsonResult findScoreOrderByCid04(){
        List<Sc> list = testService.findScoreOrderByCid04();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(35、查询不及格的课程).
     *
     * @param score
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  14:28
     */
    @RequestMapping("/findCidByScore")
    public JsonResult findCidByScore(BigDecimal score){
        List<Sc> list = testService.findCidByScore(score);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(36、查询课程编号为 01 且课程成绩在 80 分以上的学生的学号和姓名).
     *
     * @param cid
     * @param score
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  14:35
     */
    @RequestMapping("/findStudentByCidAndScore02")
    public JsonResult findStudentByCidAndScore02(Integer cid, BigDecimal score){
        List<Student> list = testService.findStudentByCidAndScore02(cid,score);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(37、求每门课程的学生人数).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  14:40
     */
    @RequestMapping("/findCidAndNum")
    public JsonResult findCidAndNum(){
        List<Sc> list = testService.findCidAndNum(null);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(38、成绩不重复，查询选修「张三」老师所授课程的学生中，成绩最高的学生信息及其成绩).
     *
     * @param name
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  15:13
     */
    @RequestMapping("/findMaxScoreByTname")
    public JsonResult findMaxScoreByTname(String name){
        List<Student> list = testService.findMaxScoreByTname(name);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(39、成绩有重复的情况下，查询选修「张三」老师所授课程的学生中，成绩最高的学生信息及其成绩).
     *
     * @param name
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  15:52
     */
    @RequestMapping("/findMaxScoreByTname02")
    public JsonResult findMaxScoreByTname02(String name){
        List<Student> list = testService.findMaxScoreByTname02(name);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(40、查询不同课程成绩相同的学生的学生编号、课程编号、学生成绩).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  16:36
     */
    @RequestMapping("/findStudentByScoreAndCid")
    public JsonResult findStudentByScoreAndCid(){
        List<Sc> list = testService.findStudentByScoreAndCid();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(41、查询每门成绩最好的前两名).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  17:25
     */
    @RequestMapping("/findScoreOrderByCid05")
    public JsonResult findScoreOrderByCid05(Integer number){
        List<Sc> list = testService.findScoreOrderByCid05(number);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(42、统计每门课程的学生选修人数（超过 5 人的课程才统计）).
     *
     * @param num
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  17:43
     */
    @RequestMapping("/findCidAndNum02")
    public JsonResult findCidAndNum02(Integer num){
        List<Sc> list = testService.findCidAndNum(num);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(43、检索至少选修两门课程的学生学号).
     *
     * @param number
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/22  17:53
     */
    @RequestMapping("/findStudentByCourseTotal02")
    public JsonResult findStudentByCourseTotal02(Integer number){
        List<Student> list = testService.findStudentByCourseTotal02(number);
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(*44、查询选修了全部课程的学生信息).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/24  9:24
     */
    @RequestMapping("/findStudentByCourse")
    public JsonResult findStudentByCourse(){
        List<Student> list = testService.findStudentByCourse();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(45、查询各学生的年龄，只按年份来算).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/24  9:38
     */
    @RequestMapping("/findStudentAndSage")
    public JsonResult findStudentAndSage(){
        List<Student> list = testService.findStudentAndSage();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(46、按照出生日期来算，当前月日 < 出生年月的月日则，年龄减一).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/24  9:56
     */
    @RequestMapping("/findStudentAndSage02")
    public JsonResult findStudentAndSage02(){
        List<Student> list = testService.findStudentAndSage02();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(47、查询本周过生日的学生).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/24  10:06
     */
    @RequestMapping("/findStudentByBirthday")
    public JsonResult findStudentByBirthday(){
        List<Student> list = testService.findStudentByBirthday();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(48、查询下周过生日的学生).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/24  10:45
     */
    @RequestMapping("/findStudentByBirthday02")
    public JsonResult findStudentByBirthday02(){
        List<Student> list = testService.findStudentByBirthday02();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(49、查询本月过生日的学生).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/24  10:46
     */
    @RequestMapping("/findStudentByBirthday03")
    public JsonResult findStudentByBirthday03(){
        List<Student> list = testService.findStudentByBirthday03();
        return JsonResultUtil.success(list);
    }


    /**
     * TODO(50、查询下月过生日的学生).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/24  10:50
     */
    @RequestMapping("/findStudentByBirthday04")
    public JsonResult findStudentByBirthday04(){
        List<Student> list = testService.findStudentByBirthday04();
        return JsonResultUtil.success(list);
    }

}

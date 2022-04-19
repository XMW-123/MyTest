package com.rt.generalframework.web;

import com.rt.generalframework.entity.Sc;
import com.rt.generalframework.entity.Student;
import com.rt.generalframework.service.TestService;
import com.rt.global.JsonResult;
import com.rt.global.JsonResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    private TestService testService;

    /**
     * TODO(1、查询"01"课程比"02"课程成绩高的学生的信息及课程分数).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  11:40
     */
    @RequestMapping("/findScore")
    public JsonResult findScore(){
        List<Student> list = testService.findScore();
        return JsonResultUtil.success(list);
    }
    
    /**
     * TODO(2、查询存在" 01 "课程但可能不存在" 02 "课程的情况).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  13:59
     */
    @RequestMapping("/findCid")
    public JsonResult findCid(){
        List<Sc> list = testService.findCid();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(3、查询同时存在01和02课程的情况).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  13:59
     */
    @RequestMapping("/findCid02")
    public JsonResult findCid02(){
        List<Sc> list = testService.findCid02();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(4、查询选择了02课程但没有01课程的情况).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  13:59
     */
    @RequestMapping("/findCid03")
    public JsonResult findCid03(){
        List<Sc> list = testService.findCid03();
        return JsonResultUtil.success(list);
    }

    /**
     * TODO(5、查询平均成绩大于等于 60 分的同学的学生编号和学生姓名和平均成绩).
     *
     * @return com.rt.global.JsonResult  
     * @author XMW
     * @since 2022/4/19  15:35
     */
    @RequestMapping("/findStudentAvg")
    public JsonResult findStudentAvg(){
        List<Student> list = testService.findStudentAvg();
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
      * @return com.rt.global.JsonResult
      * @author XMW
      * @since 2022/4/19  16:15
      */
    @RequestMapping("/findTeacherLi")
    public JsonResult findTeacherLi() {
        int sum = testService.findTeacherLi();
        return JsonResultUtil.success(sum);
    }

    /**
     * TODO(9、查询学过「张三」老师授课的同学的信息).
     *
     * @return com.rt.global.JsonResult
     * @author XMW
     * @since 2022/4/19  16:43
     */
    @RequestMapping("/findStudentByTeacher")
    public JsonResult findStudentByTeacher() {
        List<Student> list = testService.findStudentByTeacher();
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

}

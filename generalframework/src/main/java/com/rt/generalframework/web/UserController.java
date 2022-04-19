package com.rt.generalframework.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Map;

@RestController
@RequestMapping("/v1")
@Slf4j
public class UserController {

    @RequestMapping("/testCA")
    public JSONObject testCA(@RequestBody(required=false) Object reqJson) {
        System.out.println(JSONObject.toJSONString(reqJson));
        String logFilePath = "CAResult.txt";
        try {
            FileWriter writer = new FileWriter(logFilePath, true);
            BufferedWriter bWriter = new BufferedWriter(writer);
            bWriter.write(JSONObject.toJSONString(reqJson));
            bWriter.flush();
            bWriter.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject rse = new JSONObject();
        rse.put("code", "0000");
        rse.put("info", "操作成功");
        return rse;
    }

    @RequestMapping("/testCaJsonObj")
    public JSONObject testCaJsonObj(@RequestBody(required=false) JSONObject reqJson) {
        System.out.println(reqJson.toJSONString());
        String logFilePath = "CAResult.txt";
        try {
            FileWriter writer = new FileWriter(logFilePath, true);
            BufferedWriter bWriter = new BufferedWriter(writer);
            bWriter.write(reqJson.toJSONString());
            bWriter.flush();
            bWriter.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject rse = new JSONObject();
        rse.put("code", "0000");
        rse.put("info", "操作成功");
        return rse;
    }

    @RequestMapping("/reprotSign/ktYSQCallBack")
    public JSONObject testCaStr(@RequestBody(required=false) String reqJson) {
        System.out.println(reqJson);
        String logFilePath = "CAResult.txt";
        try {
            FileWriter writer = new FileWriter(logFilePath, true);
            BufferedWriter bWriter = new BufferedWriter(writer);
            bWriter.write(reqJson);
            bWriter.flush();
            bWriter.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject rse = new JSONObject();
        rse.put("code", "0000");
        rse.put("info", "操作成功");
        return rse;
    }
}
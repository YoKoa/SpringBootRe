package com.example.demo.web;

import com.example.demo.domin.student;
import com.example.demo.repository.studentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by ZhangZhen on 2017/7/27.
 */
@Controller
public class HelloWorldController {
    @Autowired
    private studentMapper studentMapper;

    @RequestMapping("/")
    @ResponseBody
    public String toHello(Model model)
    {
        model.addAttribute("1","zhangzhen");
        return "index";
    }
    @RequestMapping("/hellohtml")
    public String helloHtml(Map<String,Object> map){

        map.put("name",studentMapper.findById(1).getName());
        return "helloHtml";
    }
    @RequestMapping("/accept")
    @ResponseBody
    public String accept(@RequestParam("school") String name)
    {
        return name;
    }

}

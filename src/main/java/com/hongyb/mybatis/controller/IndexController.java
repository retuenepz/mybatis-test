package com.hongyb.mybatis.controller;

import com.hongyb.mybatis.bean.Student;
import com.hongyb.mybatis.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hongyanbo on 2018/1/31.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private StudentMapper mapper;
    @RequestMapping("/hello")
    public String index(Model model){
        List<Student> list = mapper.getList();
        model.addAttribute("list",list);
        return "hello";
    }
}

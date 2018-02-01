package com.hongyb.mybatis.dao;

import com.hongyb.mybatis.bean.Student;

import java.util.List;

/**
 * Created by hongyanbo on 2018/2/1.
 */
public interface StudentMapper {
    List<Student> getList();
}

package com.hongyb.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hongyanbo on 2018/1/31.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String path = "spring-mybatis.xml";
        InputStream config = Resources.getResourceAsStream(path);
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        System.out.println(ssf);
    }
}

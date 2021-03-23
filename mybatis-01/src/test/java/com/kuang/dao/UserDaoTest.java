package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-03-22 20:00
 */
public class UserDaoTest {
    @Test
    public  void test(){
        //第一部：从自己创建的工具类获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL,面向接口编程，即实现UserDao接口的方法
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();

    }
}

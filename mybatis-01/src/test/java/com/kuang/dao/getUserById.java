package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


/**
 * @author shkstart
 * @create 2021-03-22 23:36
 */
public class getUserById {
    @Test
    public  void test(){
        //第一部：从自己创建的工具类获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL,面向接口编程，即实现UserDao接口的方法
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);

        User userById = userDao.getUserById(1);
        System.out.println(userById);
        sqlSession.close();

    };

    @Test
    public  void test2(){
        //第一部：从自己创建的工具类获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL,面向接口编程，即实现UserDao接口的方法
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        int res = userDao.addUser(new User(4, "哈哈", "123"));
        if (res>0){
            System.out.println("插入成功");
        }

        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }
}

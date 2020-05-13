package com.bdqn;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * @author mo
 * @Description: 单元测试类
 * @date 2020-05-13 18:31
 */

public class SmbmsUserMapperTest {

    @Test
    public void testSelectCount() throws IOException {
        //sqlSessionFactoryBuilder，用于建造sqlSessionFactory
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        //sqlSeeionFactory 用于生产sqlSession。
        SqlSessionFactory sessionFactory = factoryBuilder.build(Resources.getResourceAsReader("mybatis-config.xml"));
        //创建sqlSession,用于连接数据库，并执行操作
        SqlSession sqlSession = sessionFactory.openSession(true);
        Integer result = sqlSession.selectOne("com.bdqn.SmbmsUserMapper.selectCount");
        System.out.println(result);
    }

}

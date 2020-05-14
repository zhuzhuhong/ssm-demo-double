package com.bdqn;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author mo
 * @Description: 单元测试类
 * @date 2020-05-13 18:31
 */

public class SmbmsUserMapperTest {

    private SqlSession sqlSession = null;
    private SmbmsUserMapper mapper = null;

    @Before
    public void before() throws Exception {
        //sqlSessionFactoryBuilder，用于建造sqlSessionFactory
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        //sqlSeeionFactory 用于生产sqlSession。
        SqlSessionFactory sessionFactory = factoryBuilder.build(Resources.getResourceAsReader("mybatis-config.xml"));
        //创建sqlSession,用于连接数据库，并执行操作
        sqlSession = sessionFactory.openSession(true);
        mapper = sqlSession.getMapper(SmbmsUserMapper.class);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectCount() throws IOException {

        Integer result = sqlSession.selectOne("com.bdqn.SmbmsUserMapper.selectCount");
        System.out.println(result);
    }

    @Test
    public void testSelectUserList() {
        List<SmbmsUser> userList = mapper.selectUserList();
        for (SmbmsUser smbmsUser : userList) {
            System.out.println(smbmsUser);
        }
    }

    @Test
    public void testCustomUser() {
        List<CustomUser> customUsers = mapper.selectCostomeUser();
        for (CustomUser customUser : customUsers) {

        }
    }

}

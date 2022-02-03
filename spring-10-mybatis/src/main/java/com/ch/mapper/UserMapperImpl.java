/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/2 18:49
 * 开发名称：UserMapperImpl
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.mapper;

import com.ch.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    /**原来 我们的虽有操作，都是使用sqlSession来执行；
     * 现在用：SqlSessionTemplate*/
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUsers() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUsers();
    }

}
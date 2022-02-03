/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/2 22:41
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
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }


    @Override
    public List<User> selectUser() {
        User user = new User(10,"aaaa","aaa");
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(10);

        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return sqlSessionTemplate.getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return sqlSessionTemplate.getMapper(UserMapper.class).deleteUser(id);
    }
}
/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/2 19:38
 * 开发名称：UserMapper2
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.mapper;

import com.ch.pojo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapper2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUsers() {
        return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }
}
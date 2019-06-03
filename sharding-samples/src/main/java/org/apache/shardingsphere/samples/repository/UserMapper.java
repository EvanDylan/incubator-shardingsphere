package org.apache.shardingsphere.samples.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.shardingsphere.samples.po.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT user_id FROM t_user ORDER BY age")
    List<User> queryAllUserOrderByAge();

    @Insert("INSERT t_user VALUES(#{userId}, #{age})")
    void insertUser(@Param("userId") long userId, @Param("age") int age);
}

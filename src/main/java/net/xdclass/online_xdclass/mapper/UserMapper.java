package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int save(User user);

    User findByPhone(@Param("phone") String phone);


    User findByPhoneAndPwd(@Param("phone") String phone, @Param("pwd") String pwd);

    User findByUserId(@Param("user_id") Integer userId);

    User findByNewArea(@Param("new_area") String newArea);

    User findByNewTest(@Param("new_test") String newTest);

    int deleteUserById(@Param("id") Integer id);

    int updateUser(User user);


}

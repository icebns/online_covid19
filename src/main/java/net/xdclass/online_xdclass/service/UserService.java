package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserService {

    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int save(Map<String, String> userInfo);


    String findByPhoneAndPwd(String phone, String pwd);

    User findByNewTest(@Param("new_test") String newTest);

    User findByNewArea(@Param("new_area") String newArea);

    User findByUserId(@Param("id") Integer userId);

    int deleteUserById(@Param("id") Integer id);

    int updateUser(Map<String, String> userInfo);

    List<User> listUser();
}

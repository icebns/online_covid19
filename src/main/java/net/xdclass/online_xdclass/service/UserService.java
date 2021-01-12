package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserService {

    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int save(Map<String, String> userInfo);


    String findByPhoneAndPwd(String phone, String pwd);

    User findByNewTest(@Param("new_test") Integer newTest);

    User findByUserId(@Param("id") Integer userId);
}

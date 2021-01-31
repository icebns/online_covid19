package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TestService {

    List<Test> listTest();

    Test findTestById(@Param("test_id") Integer testId);

    /**提交报告并修改user表内容*/
    int addUserTest(Map<String, String> testInfo);
    int addTest(Map<String, String> testInfo);
    /**删除*/
    int deleteTestById(@Param("test_id") Integer testId);
    /**更新*/
    int updateTest(Map<String, String> testInfo);
}

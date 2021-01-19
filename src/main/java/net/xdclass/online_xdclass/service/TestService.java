package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TestService {

    List<Test> listTest();

    Test findTestById(@Param("test_id") Integer testId);

    int addTest(Map<String, String> testInfo);
}

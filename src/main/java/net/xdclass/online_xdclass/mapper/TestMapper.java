package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {

    /**查询列表*/
    List<Test> listTest();
    /**查询详情*/
    Test findTestById(@Param("test_id") Integer testId);
    /**提交报告并修改user表内容*/
    int addUserTest(Test test);
    int addTest(Test test);
    /**删除*/
    int deleteTestById(@Param("test_id") Integer testId);
    /**更新*/
    int updateTest(Test test);

}

package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {

    /**查询文章列表*/
    List<Test> listTest();
    /**查询文章详情*/
    Test findTestById(@Param("test_id") Integer testId);


    int addTest(Test test);
}

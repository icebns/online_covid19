package net.xdclass.online_xdclass.service.impl;

import net.xdclass.online_xdclass.mapper.TestMapper;
import net.xdclass.online_xdclass.model.entity.Test;
import net.xdclass.online_xdclass.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> listTest() {
        return testMapper.listTest();
    }

    @Override
    public Test findTestById(Integer testId) {
        // 需要使用mybaits关联复杂查询
        Test test = testMapper.findTestById(testId);

        return test;
    }

    @Override
    public int addTest(Map<String, String> testInfo){
        Test test = parseToTest(testInfo);
        if( test != null){
            return testMapper.addTest(test);
        }else {
            return -1;
        }
    }

    @Override
    public int addUserTest(Map<String, String> testInfo){
        Test test = parseToTest(testInfo);
        if( test != null){
            return testMapper.addUserTest(test);
        }else {
            return -1;
        }
    }

    private Test parseToTest(Map<String, String> testInfo) {
        if (testInfo.containsKey("id") && testInfo.containsKey("test_img") &&
                testInfo.containsKey("test_result") && testInfo.containsKey("test_doctor")){
            Test test = new Test();
            test.setId(Integer.valueOf(testInfo.get("id")));
            test.setTestImg(testInfo.get("test_img"));
            test.setTestResult(testInfo.get("test_result"));
            test.setTestDoctor(testInfo.get("test_doctor"));
            test.setTestTime(new Date());
            System.out.println(test);
            return test;
        }else {
            return null;
        }
    }

    public int deleteTestById(Integer testId) {
        int test = testMapper.deleteTestById(testId);
        return test;
    }

    @Override
    public int updateTest(Map<String, String> testInfo){
        Test test = parseToUpdateTest(testInfo);
        if( test != null){
            return testMapper.updateTest(test);
        }else {
            return -1;
        }
    }

    private Test parseToUpdateTest(Map<String, String> testInfo) {
        if (testInfo.containsKey("test_id") && testInfo.containsKey("test_img") &&
                testInfo.containsKey("test_result") && testInfo.containsKey("test_doctor")
                && testInfo.containsKey("id")){
            Test test = new Test();
            test.setTestId(Integer.valueOf(testInfo.get("test_id")));
            test.setTestImg(testInfo.get("test_img"));
            test.setTestResult(testInfo.get("test_result"));
            test.setTestDoctor(testInfo.get("test_doctor"));
            test.setId(Integer.valueOf(testInfo.get("id")));
            System.out.println(test);
            return test;
        }else {
            return null;
        }
    }

}











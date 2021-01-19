package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.model.entity.Test;
import net.xdclass.online_xdclass.service.TestService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/pub/test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * get-输出列表
     * @return
     */
    @RequestMapping("list")
    public JsonData listTest(){
        List<Test> testList = testService.listTest();
        return JsonData.buildSuccess(testList);
    }

    /**
     * post-获取详情
     * */
    @GetMapping("find_test_by_id")
    public JsonData findTestById(Integer testId){

        Test test = testService.findTestById(testId);

        return JsonData.buildSuccess(test);

    }

    /**
     * post-添加
     * @param
     * @return
     */
    @PostMapping("add_test")
    public JsonData addTest(@RequestBody Map<String,String> testInfo){

        int rows = testService.addTest(testInfo);

        return rows == 1 ? JsonData.buildSuccess(): JsonData.buildError("提交失败，请重试");
    }


}

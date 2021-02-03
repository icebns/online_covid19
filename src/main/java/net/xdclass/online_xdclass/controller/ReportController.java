package net.xdclass.online_xdclass.controller;


import net.xdclass.online_xdclass.model.entity.Report;
import net.xdclass.online_xdclass.service.ReportService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/pub/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    /**
     *  管理端打印所有的提问报告
     */

    @RequestMapping("list")
    public JsonData listReport(){
        List<Report> reportList = reportService.listReport();
        return JsonData.buildSuccess(reportList);
    }


    /**
     * 获取某一个用户的体温报告详情
     * 与ArticleController里面的id不同
     * @param id
     * @return HttpServletRequest request
     */
    @GetMapping("find_report_by_id")
    public JsonData findReportById(Integer id){

        List<Report> report = reportService.findReportById(id);

        return JsonData.buildSuccess(report);

    }

    /**
     * 获取用户的某一条体温报告详情
     * 用于手机端自查
     * @param reportId
     * @return HttpServletRequest request
     */
    @GetMapping("find_report_by_report_id")
    public JsonData findReportByReportId(Integer reportId){

        Report report = reportService.findReportByReportId(reportId);

        return JsonData.buildSuccess(report);

    }

    /**
     *delete体温报告
     * @param reportId
     * @return
     */
    @GetMapping("delete_report_by_report_id")
    public JsonData deleteReportByReportId(Integer reportId){

        int report = reportService.deleteReportByReportId(reportId);

        return JsonData.buildSuccess(report);

    }

    /**
     *添加体温报告
     * @param reportInfo
     * @return
     */
    @PostMapping("add_report")
    public JsonData addReport(@RequestBody Map<String,String> reportInfo){

        int rows = reportService.addReport(reportInfo);
        int row2 = reportService.updateReportOfUser(reportInfo);
        if(row2==1){
            rows = rows+row2-1;
        }
        return rows == 1 ? JsonData.buildSuccess(): JsonData.buildError("提交失败，请重试");
    }


    /**
     * 修改
     */
    @PostMapping("update_report")
    public JsonData updateReport(@RequestBody Map<String,String> reportInfo){

        int rows = reportService.updateReport(reportInfo);

        return rows == 1 ? JsonData.buildSuccess(): JsonData.buildError("更新失败，请重试");

    }


}

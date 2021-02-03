package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.Report;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ReportService {

    List<Report> listReport();

    /**此处 id 指 user id */
    List<Report> findReportById(@Param("id") Integer id);

    Report findReportByReportId(@Param("report_id") Integer reportId);

    int deleteReportByReportId(@Param("report_id") Integer reportId);

    int addReport(Map<String, String> reportInfo);

    int updateReportOfUser(Map<String, String> reportInfo);

    int updateReport(Map<String, String> reportInfo);
}

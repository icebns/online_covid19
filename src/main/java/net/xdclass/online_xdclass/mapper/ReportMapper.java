package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Report;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportMapper {

    List<Report> listReport();

    List<Report> findReportById(@Param("id") Integer id);

    Report findReportByReportId(@Param("report_id") Integer reportId);

    int addReport(Report report);

    int updateReportOfUser(Report report);

}

package net.xdclass.online_xdclass.service.impl;

import net.xdclass.online_xdclass.mapper.ReportMapper;
import net.xdclass.online_xdclass.model.entity.Report;
import net.xdclass.online_xdclass.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public List<Report> listReport() {
        return reportMapper.listReport();
    }

    @Override
    public List<Report> findReportById(Integer id) {

        List<Report> report = reportMapper.findReportById(id);

        return report;
    }

    @Override
    public Report findReportByReportId(Integer reportId) {

        Report report = reportMapper.findReportByReportId(reportId);

        return report;
    }

    public int deleteReportByReportId(Integer reportId) {
        System.out.println("reportId = [" + reportId + "]");
        int report = reportMapper.deleteReportByReportId(reportId);
        return report;
    }

    @Override
    public int addReport(Map<String, String> reportInfo){
        Report report = parseToReport(reportInfo);
        if( report != null){
            return reportMapper.addReport(report);
        }else {
            return -1;
        }
    }
    @Override
    public int updateReportOfUser(Map<String, String> reportInfo){
        Report report = parseToReport(reportInfo);
        if( report != null){
            return reportMapper.updateReportOfUser(report);
        }else {
            return -1;
        }
    }

    @Override
    public int updateReport(Map<String, String> reportInfo){
//        System.out.println(reportInfo);
        Report report = parseToUpdateReport(reportInfo);
        if( report != null){
            return reportMapper.updateReport(report);
        }else {
            return -1;
        }
    }

    private Report parseToReport(Map<String, String> reportInfo) {
        if (reportInfo.containsKey("id") && reportInfo.containsKey("home") &&
                reportInfo.containsKey("temperature") && reportInfo.containsKey("contact") &&
                reportInfo.containsKey("go_out")){
            Report report = new Report();
            report.setId(Integer.valueOf(reportInfo.get("id")));
            report.setHome(reportInfo.get("home"));
            report.setTemperature(reportInfo.get("temperature"));
            report.setContact(reportInfo.get("contact"));
            report.setGoOut(reportInfo.get("go_out"));
            report.setHealth(reportInfo.get("health"));
            report.setReportTime(new Date());
            System.out.println(report);
            return report;
        }else {
            return null;
        }
    }

    private Report parseToUpdateReport(Map<String, String> reportInfo) {
        if (reportInfo.containsKey("report_id") && reportInfo.containsKey("home") &&
                reportInfo.containsKey("temperature") && reportInfo.containsKey("contact") &&
                reportInfo.containsKey("go_out")){
            Report report = new Report();
            report.setReportId(Integer.valueOf(reportInfo.get("report_id")));
            report.setHome(reportInfo.get("home"));
            report.setTemperature(reportInfo.get("temperature"));
            report.setContact(reportInfo.get("contact"));
            report.setGoOut(reportInfo.get("go_out"));
            report.setHealth(reportInfo.get("health"));
            System.out.println(report);
            return report;
        }else {
            return null;
        }
    }

}











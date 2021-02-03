package net.xdclass.online_xdclass.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Report {
/**
 * report_id
 * id
 * home
 * temperature
 * contact
 * go_out
 * health
 * report_time
 *
 */
    private Integer reportId;

    private Integer id;

    private String home;

    private String name;

    private String temperature;

    private String contact;

    private String goOut;

    private String health;

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date reportTime;


    @Override
    public String toString() {
        return "Report{" +
                "reportId=" + reportId +
                ", id=" + id +
                ", home='" + home + '\'' +
                ", name='" + name + '\'' +
                ", temperature='" + temperature + '\'' +
                ", contact='" + contact + '\'' +
                ", goOut='" + goOut + '\'' +
                ", health='" + health + '\'' +
                ", reportTime=" + reportTime +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGoOut() {
        return goOut;
    }

    public void setGoOut(String goOut) {
        this.goOut = goOut;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
}

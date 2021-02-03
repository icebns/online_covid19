package net.xdclass.online_xdclass.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Test {

    /**
     * test_id
     * id
     * name
     * test_img
     * test_result
     * test_doctor
     * test_time
     */
    private Integer testId;

    private Integer id;

    private String name;

    private String testImg;

    private String testResult;

    private String testDoctor;

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date testTime;


    @Override
    public String toString() {
        return "Test{" +
                "testId=" + testId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", testImg='" + testImg + '\'' +
                ", testResult='" + testResult + '\'' +
                ", testDoctor='" + testDoctor + '\'' +
                ", testTime=" + testTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestImg() {
        return testImg;
    }

    public void setTestImg(String testImg) {
        this.testImg = testImg;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getTestDoctor() {
        return testDoctor;
    }

    public void setTestDoctor(String testDoctor) {
        this.testDoctor = testDoctor;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }
}

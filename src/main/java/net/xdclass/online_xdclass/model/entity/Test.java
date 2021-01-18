package net.xdclass.online_xdclass.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Test {

    /**
     * test_id
     * id
     * test_img
     * test_result
     * test_docter
     * test_time
     */
    private Integer testId;

    private Integer id;

    private String testImg;

    private String testResult;

    private String testDocter;

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date testTime;


    @Override
    public String toString() {
        return "Test{" +
                "testId=" + testId +
                ", id=" + id +
                ", testImg='" + testImg + '\'' +
                ", testResult='" + testResult + '\'' +
                ", testDocter='" + testDocter + '\'' +
                ", testTime=" + testTime +
                '}';
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

    public String getTestDocter() {
        return testDocter;
    }

    public void setTestDocter(String testDocter) {
        this.testDocter = testDocter;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }
}

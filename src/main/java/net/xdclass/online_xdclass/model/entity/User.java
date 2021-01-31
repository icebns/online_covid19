package net.xdclass.online_xdclass.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * `id` int(11) unsigned NOT NULL AUTO_INCREMENT, 身份证
 *   `name` varchar(128) DEFAULT NULL COMMENT '姓名',
 *   `pwd` varchar(124) DEFAULT NULL COMMENT '密码',
 *   `head_img` varchar(524) DEFAULT NULL COMMENT '头像',
 *   `phone` varchar(64) DEFAULT '' COMMENT '手机号',
 *   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
 *   newTest检测结果
 *   userLevel权限等级
 *   newArea地区
 */
public class User {

    private Integer id;

//    private Integer id;

    private String name;

    @JsonIgnore
    private String pwd;

    @JsonProperty("head_img")
    private String headImg;

    private String phone;

    private String newTest;

    private Integer userLevel;

    private String newArea;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", headImg='" + headImg + '\'' +
                ", phone='" + phone + '\'' +
                ", newTest=" + newTest +
                ", userLevel=" + userLevel +
                ", newArea='" + newArea + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getNewArea() {
        return newArea;
    }

    public void setNewArea(String newArea) {
        this.newArea = newArea;
    }

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getNewTest() {
        return newTest;
    }

    public void setNewTest(String newTest) {
        this.newTest = newTest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}

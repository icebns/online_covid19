package net.xdclass.online_xdclass.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Article {

    /**
     * (`article_id`,
     * `article_title`,
     * `article_img`,
     * `article_content`,
     * `article_level`,
     * `article_time`,
     * `article_author`,
     * `author_id`)
     * */

    private Integer articleId;

    private Integer authorId;

    private String articleAuthor;

    private String articleTitle;

    private String articleImg;

    private String articleContent;

    private Integer articleLevel;

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date articleTime;


    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleImg='" + articleImg + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleLevel=" + articleLevel +
                ", articleTime=" + articleTime +
                ", articleAuthor='" + articleAuthor + '\'' +
                ", authorId=" + authorId +
                '}';
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleLevel() {
        return articleLevel;
    }

    public void setArticleLevel(Integer articleLevel) {
        this.articleLevel = articleLevel;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }


}

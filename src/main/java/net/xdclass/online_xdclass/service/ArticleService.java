package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleService {

    List<Article> listArticle();

    Article findArticleById(@Param("article_id") Integer articleId);
}
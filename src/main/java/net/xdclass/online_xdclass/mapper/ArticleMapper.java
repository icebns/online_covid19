package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {

    /**查询文章列表*/
    List<Article> listArticle();
    /**查询文章详情*/
    Article findArticleById(@Param("article_id") Integer articleId);


}

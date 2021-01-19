package net.xdclass.online_xdclass.service.impl;

import net.xdclass.online_xdclass.mapper.ArticleMapper;
import net.xdclass.online_xdclass.model.entity.Article;
import net.xdclass.online_xdclass.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> listArticle() {
        return articleMapper.listArticle();
    }

    @Override
    public Article findArticleById(Integer articleId) {
        // 需要使用mybaits关联复杂查询
        Article article = articleMapper.findArticleById(articleId);

        return article;
    }

    @Override
    public int addArticle(Map<String, String> articleInfo){
        Article article = parseToArticle(articleInfo);
        if( article != null){
            return articleMapper.addArticle(article);
        }else {
            return -1;
        }
    }

    private Article parseToArticle(Map<String, String> articleInfo) {
        if (articleInfo.containsKey("author_id") && articleInfo.containsKey("article_author") &&
                articleInfo.containsKey("article_title") && articleInfo.containsKey("article_img") &&
                articleInfo.containsKey("article_content")){
            Article article = new Article();
            article.setAuthorId(Integer.valueOf(articleInfo.get("author_id")));
            article.setArticleAuthor(articleInfo.get("article_author"));
            article.setArticleTitle(articleInfo.get("article_title"));
            article.setArticleImg(articleInfo.get("article_img"));
            article.setArticleContent(articleInfo.get("article_content"));
            article.setArticleLevel(1);
            article.setArticleTime(new Date());
            System.out.println(article);
            return article;
        }else {
            return null;
        }
    }
}











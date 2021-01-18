package net.xdclass.online_xdclass.service.impl;

import net.xdclass.online_xdclass.mapper.ArticleMapper;
import net.xdclass.online_xdclass.model.entity.Article;
import net.xdclass.online_xdclass.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}

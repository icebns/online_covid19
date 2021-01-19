package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.model.entity.Article;
import net.xdclass.online_xdclass.service.ArticleService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/pub/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("list")
    public JsonData listArticle(){
        List<Article> articleList = articleService.listArticle();
        return JsonData.buildSuccess(articleList);
    }

    @GetMapping("find_article_by_id")
    public JsonData findArticleById(Integer articleId){

        Article article = articleService.findArticleById(articleId);

        return JsonData.buildSuccess(article);

    }

    @PostMapping("add_article")
    public JsonData addArticle(@RequestBody Map<String,String> articleInfo){

        int rows = articleService.addArticle(articleInfo);

        return rows == 1 ? JsonData.buildSuccess(): JsonData.buildError("提交失败，请重试");
    }


}

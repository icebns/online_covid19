package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.model.entity.Article;
import net.xdclass.online_xdclass.service.ArticleService;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

//    @RequestMapping("find_detail_by_id")
//    public JsonData findDetailById(HttpServletRequest request){
//        Integer articleId = (Integer) request.getAttribute("article_id");
//        if(articleId == null){
//            return JsonData.buildError("查询失败");
//        }
//        Article article = articleService.findDetailById(articleId);
//        return JsonData.buildSuccess(article);
//    }
    @GetMapping("find_article_by_id")
    public JsonData findArticleById(Integer articleId){

        Article article = articleService.findArticleById(articleId);

        return JsonData.buildSuccess(article);

    }

}

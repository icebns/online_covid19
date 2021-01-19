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

    /**
     * get-输出文章列表
     * @return
     */
    @RequestMapping("list")
    public JsonData listArticle(){
        List<Article> articleList = articleService.listArticle();
        return JsonData.buildSuccess(articleList);
    }

    /**
     * post-获取文章详情
     * 此处考虑不周，
     * 这个接口实质是通过article_id找文章详情
     * */
    @GetMapping("find_article_by_id")
    public JsonData findArticleById(Integer articleId){

        Article article = articleService.findArticleById(articleId);

        return JsonData.buildSuccess(article);

    }

    /**
     * post-添加文章
     * @param articleInfo
     * @return
     */
    @PostMapping("add_article")
    public JsonData addArticle(@RequestBody Map<String,String> articleInfo){

        int rows = articleService.addArticle(articleInfo);

        return rows == 1 ? JsonData.buildSuccess(): JsonData.buildError("提交失败，请重试");
    }


}

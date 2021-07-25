package com.michalstepien.module.dashboard;

import com.michalstepien.module.dashboard.dto.ArticleDto;
import com.michalstepien.module.dashboard.dto.MenuDto;
import com.michalstepien.module.dashboard.service.ArticleService;
import com.michalstepien.module.dashboard.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashboardRestController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private MenuService menuService;

    @GetMapping("/api/dashboard/menu")
    public List<MenuDto> getDashboardMenu() {
        return menuService.getMenu();
    }

    @GetMapping("/api/dashboard/articles")
    public ArticleDto getDashboardArticles() {
        return articleService.getArticle();
    }
}

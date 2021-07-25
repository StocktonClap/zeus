package com.michalstepien.module.dashboard;

import com.michalstepien.module.dashboard.service.ArticleService;
import com.michalstepien.module.dashboard.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private MenuService menuService;

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {

        model.addAttribute("menu", menuService.getMenu());
        model.addAttribute("article", articleService.getArticle());

        return "dashboard.html";
    }
}
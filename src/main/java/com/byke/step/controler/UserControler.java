package com.byke.step.controler;

import com.byke.step.model.Articles;
import com.byke.step.model.User;
import com.byke.step.service.ArticleService;
import com.byke.step.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.token.Token;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserControler {

    @Autowired
    UserService userService;
    ArticleService articleService;

    @PostMapping("/api/user")
    public User saveUser(@RequestBody User userRequest){
        return userService.saveUser(userRequest);
    }

    @PostMapping("/api/articles")
    public Articles saveArticles(@RequestBody Articles articleRequest){
        return articleService.saveArticles(articleRequest);
    }

    @PostMapping("/api/authenticate")
    public Token authenticate(){

        return null;
    }

}

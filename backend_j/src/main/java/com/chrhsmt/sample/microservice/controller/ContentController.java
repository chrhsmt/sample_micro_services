package com.chrhsmt.sample.microservice.controller;

import com.chrhsmt.sample.microservice.model.Content;
import com.chrhsmt.sample.microservice.model.query.QContent;
import com.chrhsmt.sample.microservice.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("content")
@Scope("request")
public class ContentController {

    @Autowired
    ContentService contentService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Content> getContent() {
        return new QContent().findList();
//        return this.contentService.getContent();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Content add(@RequestBody Content content) {
        return this.contentService.save(content);
    }

}

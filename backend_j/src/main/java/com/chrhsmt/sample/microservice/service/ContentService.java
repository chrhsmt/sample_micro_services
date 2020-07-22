package com.chrhsmt.sample.microservice.service;

import com.chrhsmt.sample.microservice.model.Content;
import io.ebean.Database;
import io.ebean.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    @Autowired
    private Database database;

    public List<Content> getContent() {
        return this.database.find(Content.class).findList();
    }

    @Transactional
    public Content save(Content content) {
        this.database.save(content);
        if (content.getName().equals("rollback")) {
            throw new RuntimeException(("booom!"));
        }
        return content;
    }
}

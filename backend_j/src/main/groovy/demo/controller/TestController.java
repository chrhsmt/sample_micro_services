package demo.controller;

import demo.domain.ManufacturerComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private ManufacturerComponent aaa;

    @RequestMapping("test")
    public List<Map> getAaa() {
        return this.aaa.findManu();
    }
}

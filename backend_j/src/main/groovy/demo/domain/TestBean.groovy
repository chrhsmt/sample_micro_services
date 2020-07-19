package demo.domain

import demo.service.ManufacturerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class TestBean {

    @Autowired
    private ManufacturerService manufacturerService;

    public String testSearvice() {
        return this.manufacturerService.findAll().get(0).name;
    }
}

package demo.init

import demo.domain.Manufacturer

import demo.service.ManufacturerService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@CompileStatic
class BootStrap {

    @Autowired
    ManufacturerService manufacturerService

    @Transactional
    void init() {
        Manufacturer audi = new Manufacturer(name: 'audi')
        manufacturerService.save(audi)

        Manufacturer ford = new Manufacturer(name: 'ford')
        manufacturerService.save(ford)
    }
}

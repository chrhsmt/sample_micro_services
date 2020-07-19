package demo.domain

import demo.service.ManufacturerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ManufacturerComponent {

    @Autowired
    private ManufacturerService manufacturerService;

    public List<Map> findManu() {
        List<Map> list = new ArrayList<>();
        this.manufacturerService.findAll().each { m ->
            Map map = new HashMap()
            map.put("id", m.id)
            map.put("name", m.name)
            list.add(map)
        }
        return list;
    }
}

package DataBase.UserResource;

import DataBase.model.Tariff;
import DataBase.services.TariffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tariffs")
public class TariffResource {

    @Autowired
    private TariffService tariffService;

    @GetMapping
    public List<Tariff> getAll() {
        return tariffService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Tariff save (@RequestBody Tariff tariff){
        return tariffService.save(tariff);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Optional<Integer> id){
        tariffService.deleteById(id.get());
    }
}

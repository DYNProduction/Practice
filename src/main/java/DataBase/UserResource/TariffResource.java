package DataBase.UserResource;

import DataBase.model.Tariff;
import DataBase.services.TariffService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tariffs")
public class TariffResource extends CrudResource<Tariff, TariffService> {
    public TariffResource(TariffService service) {
        super(service);
    }
}

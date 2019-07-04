package DataBase.services;

import DataBase.model.Tariff;
import DataBase.repository.TariffRepository;
import org.springframework.stereotype.Service;

@Service
public class TariffService extends EntityCrud<Tariff, TariffRepository> {

    TariffService(TariffRepository repository) {
        super(repository);
    }
}

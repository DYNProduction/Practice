package com.company.programm.services;

import com.company.programm.model.Tariff;
import com.company.programm.repository.TariffRepository;
import org.springframework.stereotype.Service;

@Service
public class TariffService extends EntityCrud<Tariff, TariffRepository> {

    TariffService(TariffRepository repository) {
        super (repository);
    }
}

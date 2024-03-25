package com.bymth.sdw24.application;

import com.bymth.sdw24.domain.model.Champions;
import com.bymth.sdw24.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champions> findAll(){
        return repository.findAll();
    }

}

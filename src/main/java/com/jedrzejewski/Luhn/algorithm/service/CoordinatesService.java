package com.jedrzejewski.Luhn.algorithm.service;

import com.jedrzejewski.Luhn.algorithm.model.Coordinates;

import java.util.List;

public interface CoordinatesService {

    void saveInList(Coordinates coordinates);
    List<Coordinates> loadList();
    Coordinates start(String name);
}

package com.jedrzejewski.Luhn.algorithm.service.impl;

import com.jedrzejewski.Luhn.algorithm.model.Coordinates;
import com.jedrzejewski.Luhn.algorithm.service.CoordinatesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoordinatesServiceImpl implements CoordinatesService {

    List<Coordinates> list = new ArrayList<>();

    @Override
    public void saveInList(Coordinates coordinates) {
        list.add(coordinates);
    }

    @Override
    public List<Coordinates> loadList() {
        return list;
    }
}

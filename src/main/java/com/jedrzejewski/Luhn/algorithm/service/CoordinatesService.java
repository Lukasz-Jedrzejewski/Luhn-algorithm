package com.jedrzejewski.Luhn.algorithm.service;

import com.jedrzejewski.Luhn.algorithm.model.Coordinates;

import java.util.List;

public interface CoordinatesService {

    void saveInList(Coordinates coordinates);
    List<Coordinates> loadList();
    List<String> loadRoadList();
    Coordinates start(String name);
    List<Double> lengthOfTheRoad(String startPointName, List<Coordinates> cordsList);
    double executeAlgorithm(double startXParam, double startYParam, double currentXParam, double currentYParam);
    void clear();
}

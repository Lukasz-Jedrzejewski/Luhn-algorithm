package com.jedrzejewski.Luhn.algorithm.service.impl;

import com.jedrzejewski.Luhn.algorithm.model.Coordinates;
import com.jedrzejewski.Luhn.algorithm.service.CoordinatesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CoordinatesServiceImpl implements CoordinatesService {

    List<Coordinates> list = new ArrayList<>();
    List<Coordinates> roadList = new ArrayList<>();

    @Override
    public void saveInList(Coordinates coordinates) {
        list.add(coordinates);
    }

    @Override
    public List<Coordinates> loadList() {
        return list;
    }

    @Override
    public List<String> loadRoadList() {
        List<String> nameList = new ArrayList<>();
        for (Coordinates names : roadList) {
            nameList.add(names.getName());
        }
        return nameList;
    }

    @Override
    public Coordinates start(String name) {
        Coordinates start = null;
        for (Coordinates coordinatesByName : list) {
            if (coordinatesByName.getName().equals(name)) {
                start = coordinatesByName;
            }
        }
        return start;
    }

    @Override
    public List<Double> lengthOfTheRoad(String startPointName, List<Coordinates> cordsList) {
        List<Double> lengthList = new ArrayList<>();
        Coordinates startPoint = start(startPointName);
        cordsList = loadList();
        cordsList.remove(startPoint);
        Coordinates actualElement = null;
        roadList.add(startPoint);
        double min = 360;
        while (!cordsList.isEmpty()) {
            for (int i = 0; i < cordsList.size(); i++) {
                double actualRoadLength = executeAlgorithm(startPoint.getxParameter(), startPoint.getyParameter(),
                        cordsList.get(i).getxParameter(), cordsList.get(i).getyParameter());
                if (actualRoadLength < min) {
                    min = actualRoadLength;
                    actualElement = cordsList.get(i);
                }
            }
            lengthList.add(min);
            min = 360;
            roadList.add(actualElement);
            startPoint = actualElement;
            cordsList.remove(actualElement);
        }

        return lengthList;
    }

    @Override
    public double executeAlgorithm(double startXParam, double startYParam, double currentXParam, double currentYParam) {
        return Math.sqrt(Math.pow((currentXParam - startXParam),2) + Math.pow((currentYParam-startYParam),2));
    }

    @Override
    public void clear() {
        list.removeAll(list);
        roadList.removeAll(roadList);
    }
}

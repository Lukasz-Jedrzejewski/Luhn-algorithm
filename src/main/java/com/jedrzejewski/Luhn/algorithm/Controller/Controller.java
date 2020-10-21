package com.jedrzejewski.Luhn.algorithm.Controller;

import com.jedrzejewski.Luhn.algorithm.model.Coordinates;
import com.jedrzejewski.Luhn.algorithm.model.Numbers;
import com.jedrzejewski.Luhn.algorithm.service.impl.CoordinatesServiceImpl;
import com.jedrzejewski.Luhn.algorithm.service.impl.NumbersServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    private final NumbersServiceImpl numbersService;
    private final CoordinatesServiceImpl coordinatesService;

    public Controller(NumbersServiceImpl numbersService, CoordinatesServiceImpl coordinatesService) {
        this.numbersService = numbersService;
        this.coordinatesService = coordinatesService;
    }

    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("numbers", new Numbers());
        coordinatesService.clear();
        return "index";
    }

    @PostMapping("/")
    public String post(@ModelAttribute Numbers numbers, Model model){
        if (!numbersService.checkDigits(numbers.toString())) {
            return "badRequest";
        }
        model.addAttribute("result", numbersService.validate(numbers.toString()));
        model.addAttribute("checkDigit", numbersService.getACheckDigit(numbers.toString()));
        return "response";
    }

    @GetMapping("/nna")
    public String getQuantity(Model model) {
        model.addAttribute("coordinates", new Coordinates());
        return "nna";
    }

    @GetMapping("/nna-coordinates")
    public String getCoordinates(@ModelAttribute Coordinates coordinates, Model model) {
        coordinatesService.saveInList(coordinates);
        model.addAttribute("list", coordinatesService.loadList());
        return "nna-coordinates";
    }

    @GetMapping("/nna-algorithm/{name}")
    public String executeTheAlgorithm (Model model, @PathVariable String name) {
        model.addAttribute("coordinates", coordinatesService.start(name));
        model.addAttribute("length", coordinatesService.lengthOfTheRoad(name, coordinatesService.loadList()));
        model.addAttribute("road", coordinatesService.loadRoadList());
        return "nna-algorithm";
    }
}

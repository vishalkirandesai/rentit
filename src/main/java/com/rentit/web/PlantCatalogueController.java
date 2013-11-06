package com.rentit.web;
import com.rentit.main.PlantCatalogue;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/plantcatalogues")
@Controller
@RooWebScaffold(path = "plantcatalogues", formBackingObject = PlantCatalogue.class)
public class PlantCatalogueController {
}

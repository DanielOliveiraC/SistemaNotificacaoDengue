package com.ifpi.fichadengue.controllers;

import com.ifpi.fichadengue.models.FormsModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class FormDataController {

    private List<FormsModel> formsModelList = new ArrayList<>();

    @GetMapping("/notificar")
    public String exibirNotificacao(Model model) {
        model.addAttribute("formsModel", new FormsModel());
        return "notify";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute FormsModel formsModel, Model model) {
        formsModel.setId(UUID.randomUUID());
        formsModelList.add(formsModel);
        String ver = formsModel.toString();
        System.out.println(ver);
        return "redirect:/notificar";
    }
}

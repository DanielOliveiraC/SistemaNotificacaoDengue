package com.ifpi.fichadengue.controllers;

import com.ifpi.fichadengue.models.GeneralDataModel;
import com.ifpi.fichadengue.models.IndividualNotificationModel;

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
public class GeneralDataController {

    private List<GeneralDataModel> generalDataModelList = new ArrayList<>();

    @GetMapping("/notificar")
    public String exibirNotificacao(Model model) {
        model.addAttribute("generalDataModel", new GeneralDataModel());
        return "notify";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute GeneralDataModel generalDataModel, IndividualNotificationModel individualNotificationModel, Model model) {
        generalDataModel.setId(UUID.randomUUID());
        generalDataModelList.add(generalDataModel);
        String ver = generalDataModel.toString();
        System.out.println(ver);
        return "redirect:/notificar";
    }
}

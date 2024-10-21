package com.ifpi.fichadengue.models;

import java.util.Date;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

public class IndividualNotificationModel {
    private UUID idIndividualNotification;
    private String nomePaciente;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dataNascimento;
    private int idade;
    

    public IndividualNotificationModel(String nomePaciente, Date dataNascimento, int idade) {
        this.nomePaciente = nomePaciente;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }


    public UUID getIdIndividualNotification() {
        return idIndividualNotification;
    }
    public void setIdIndividualNotification(UUID idIndividualNotification) {
        this.idIndividualNotification = idIndividualNotification;
    }

}
package com.example.mesure_glycemie_ma_version.controller;

import com.example.mesure_glycemie_ma_version.model.patient;
public class controller {
    private static patient patient;
    private static controller instance =null;
    public static controller getInstance(){
        if (controller.instance==null) {
            controller.instance =new controller();}
        return controller.instance;

    }
    public void create_patient(int age ,float valeur , boolean isFasting){
        patient=new patient(age,valeur,isFasting) ;
    }
    //update entre le controller vers la view
    public String getResult(){
        return patient.getResultat();//update patient to controller
    }

}

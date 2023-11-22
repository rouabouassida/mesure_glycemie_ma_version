package com.example.mesure_glycemie_ma_version.model;


//notify controller to model
public class patient {
    private int age;
    private float valeur;
    private boolean isFasting;
    private String resultat;

    public patient(int age, float valeur, boolean isFasting) {
        this.age = age;
        this.valeur = valeur;
        this.isFasting = isFasting;
        calculer();
    }

    public int getAge() {
        return age;
    }

    public float getVm() {
        return valeur;
    }
    //update model to controller
    public String getResultat() {
        return resultat;
    }

    public boolean getisFasting() {
        return isFasting;
    }
    public void calculer(){


        if (isFasting)
        {
            if(age >=13){
                if(valeur<5)
                    resultat="niveau de glycemie est bas";
                else
                if(valeur>=5 && valeur<=7)
                    resultat="niveau de glycemie est normal";
                else
                    resultat="niveau de glycemie ese eleve ";
            }
            else if(age >=6 && age <=12)
            {
                if(valeur<5)
                    resultat="niveau de glycemie est bas";
                else
                if(valeur>=5 && valeur<=10)
                    resultat="niveau de glycemie est normal";
                else
                    resultat="niveau de glycemie ese eleve "
                            ;}
            else if(age <6) {
                if(valeur<5.5)
                    resultat="niveau de glycemie est bas";
                else
                if(valeur>=5.5 && valeur<=10)
                    resultat="niveau de glycemie est normal";
                else
                    resultat="niveau de glycemie ese eleve ";}


        }else //false {
            if(valeur>10.0)
                resultat="niveau eleve";
            else resultat="niveau normal";


    }
}

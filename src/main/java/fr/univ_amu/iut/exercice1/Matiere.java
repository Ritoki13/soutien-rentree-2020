package fr.univ_amu.iut.exercice1;

public class Matiere {
    private double coef;
    private String intitule;

    @Override
    public String toString() {
        return "Matiere : " + intitule +
                ", coef = " + coef;
    }

    public Matiere(double coef, String intitule) {
        if (intitule == null || intitule.isEmpty()) {
            throw new IllegalArgumentException("L'intitulé d'une matière ne peut être vide");
        }
        this.coef = coef;
        this.intitule = intitule;
    }

    public double getCoef() {
        return coef;
    }

    public String getIntitule() {
        return intitule;
    }
}
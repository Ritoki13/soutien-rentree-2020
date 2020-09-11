package fr.univ_amu.iut.exercice1;

public class MoyennePonderee {
    public int calculer(TableauDeNotes tabNote) {
        int somme = 0;
        int coef = 1;
        for (int i = 0; i < tabNote.size(); i++) {
            somme += tabNote.get(i).getVal() * tabNote.get(i).getMat().getCoef();
            coef += tabNote.get(i).getMat().getCoef();
        }
        return somme / coef;
    }
}

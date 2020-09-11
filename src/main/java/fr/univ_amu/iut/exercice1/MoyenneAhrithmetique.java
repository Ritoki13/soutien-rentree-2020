package fr.univ_amu.iut.exercice1;

public class MoyenneAhrithmetique {
    public int calculer(TableauDeNotes tabNote) {
        int somme = 0;
        for (int i = 0; i < tabNote.size(); i++) {
            somme += tabNote.get(i).getVal();
        }
        return somme / tabNote.size();
    }
}

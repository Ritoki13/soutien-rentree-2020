package fr.univ_amu.iut.exercice1;

public class Etudiant {
    private String nom;
    private TableauDeNotes tabNote;

    public Etudiant(String nom) {
        this.nom = nom;
        tabNote = new TableauDeNotes();
    }

    public void noter(Matiere mat, double val) {
        Note note = new Note(mat, val);
        tabNote.ajouter(note);
    }

    public void listerNotes() {
        System.out.println("Nom : " + nom + "\n" + "Notes : " + tabNote);
    }

    public int moyenne(MoyennePonderee moy) {
        return 0;
    }
}

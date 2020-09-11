package fr.univ_amu.iut.exercice1;

public class Main {
    public static void main(String[] args) {
        Matiere mat = new Matiere(3.0, "IHM");
        System.out.println(mat);
        Note note = new Note(mat, 18);
        System.out.println(note);
        try {
            Matiere bob = new Matiere(0, "");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try { Matiere m2 = new Matiere(3,"Math");
            Note henry = new Note(m2, 18);
            Etudiant etu = new Etudiant("Tom");
            etu.noter(m2,18);
            etu.noter(new Matiere(2,"IHM"), 15);
            etu.listerNotes();

        } catch (IllegalArgumentException e2) {
            System.out.println(e2.getMessage());
        }
    }
}

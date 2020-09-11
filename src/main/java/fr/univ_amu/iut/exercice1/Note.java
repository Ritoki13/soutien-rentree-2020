package fr.univ_amu.iut.exercice1;

public class Note {
    private Matiere mat;
    private double val;

    public Note(Matiere mat, double val) {
        this.mat = mat;
        this.val = val;
    }

    @Override
    public String toString() {
        return "Note (" + mat + ") : " + val;
    }

    public Matiere getMat() {
        return mat;
    }

    public double getVal() {
        return val;
    }
}

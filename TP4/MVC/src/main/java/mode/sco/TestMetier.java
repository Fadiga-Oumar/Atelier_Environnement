package mode.sco;

import mode.sco.Scolarite;
import form.beans.NoteForm;
import java.util.Vector;

public class TestMetier {

    public static void main(String[] args) {
        Scolarite scolarite = new Scolarite();

        String num_Ins = "123456789";

        Vector<Note> notes = scolarite.getNotes(num_Ins);

        if (notes != null && !notes.isEmpty()) {
            System.out.println("Les notes de l'étudiant " + num_Ins + " sont :");
            for (Note note : notes) {
                System.out.println("Matière : " + note.getMatiere() + ", Note : " + note.getNote());
            }
        } else {
            System.out.println("Aucune note trouvée pour l'étudiant " + num_Ins);
        }
    }
}

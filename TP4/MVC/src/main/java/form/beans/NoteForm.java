package form.beans;

import java.util.Vector;

import mode.sco.Note;

public class NoteForm {
    private String num_Ins;
    private Vector<Note> lesNotes;

    public String getNum_Ins() {
        return num_Ins;
    }

    public void setNum_Ins(String num_Ins) {
        this.num_Ins = num_Ins;
    }

    public Vector<Note> getLesNotes() {
        return lesNotes;
    }

    public void setLesNotes(Vector<Note> lesNotes) {
        this.lesNotes = lesNotes;
    }
}

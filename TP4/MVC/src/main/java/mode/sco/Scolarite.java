package mode.sco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Scolarite {
    public Vector<Note> getNotes(String num_Ins) {
        Vector<Note> notes = new Vector<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = DatabaseConn.getConnection();
            String query = "SELECT * FROM notes WHERE num_Ins = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, num_Ins);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Note note = new Note();
                note.setNum_Ins(rs.getString("num_Ins"));
                note.setMatiere(rs.getString("matiere"));
                note.setNote(rs.getFloat("note"));
                notes.add(note);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return notes;
    }
}

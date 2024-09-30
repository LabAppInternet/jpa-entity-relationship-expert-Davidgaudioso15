package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import jakarta.persistence.*;


@Embeddable
@Table(name="permissionID")
public class PermissionID {
    private long noteId;
    private long userId;
    public PermissionID() {
    }
    public PermissionID(long noteId, long userId) {
        this.noteId = noteId;
        this.userId = userId;
    }

    public long getNoteId() {
        return noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}

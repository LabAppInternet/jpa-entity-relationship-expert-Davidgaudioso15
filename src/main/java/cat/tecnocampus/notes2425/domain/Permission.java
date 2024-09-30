package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import cat.tecnocampus.notes2425.domain.*;
@Entity
@Table(name="permission")
public class Permission{
    @EmbeddedId
    private PermissionID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "owner_id")
    UserLab owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "note_id")
    Note note;
    boolean canRead;
    boolean canEdit;


    public Permission(){}

    public Permission(UserLab owner,Note note,boolean canEdit,boolean canRead){
        this.owner = owner;
        this.note = note;
        this.canRead = canRead;
        this.canEdit = canEdit;
    }

    public UserLab getOwner() {
        return owner;
    }

    public Note getNote() {
        return note;
    }

    public boolean isCanRead() {
        return canRead;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setOwner(UserLab owner) {
        this.owner = owner;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}

package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;


@Entity
public class UserLab {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        String username;

        String email;

        public UserLab() {}

        public UserLab(long id, String username,String email){
            this.id = id;
            this.username = username;
            this.email = email;
        }

        public long getId() {
                return id;
            }

        public String getUsername() {
                return username;
        }

        public String getEmail() {
                return email;
        }
}

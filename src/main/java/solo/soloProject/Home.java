package solo.soloProject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Home {
    @Id @GeneratedValue
    private Long id;

    private String HomeName;

}

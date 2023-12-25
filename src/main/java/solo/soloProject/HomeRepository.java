package solo.soloProject;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class HomeRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Home home) {
        em.persist(home);
        return home.getId();
    }

    public Home find(Long id) {
        return em.find(Home.class, id);
    }
}

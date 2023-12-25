package solo.soloProject;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(value = false)
public class HomeRepositoryTest {

    @Autowired HomeRepository homeRepository;

    @Test
    @Transactional
    public void HomeTest() throws Exception{

        Home home = new Home();
        home.setHomeName("home1");

        Long savedId = homeRepository.save(home);
        Home findHome = homeRepository.find(savedId);

        Assertions.assertThat(findHome.getId()).isEqualTo(home.getId());
        Assertions.assertThat(findHome.getHomeName()).isEqualTo(home.getHomeName());
        Assertions.assertThat(findHome).isEqualTo(home); // 영속성 컨텍스트에의해 같다(true) //JPA 엔티티 동일성 보장
    }



}
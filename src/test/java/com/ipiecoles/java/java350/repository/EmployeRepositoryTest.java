package java.com.ipiecoles.java.java350.repository;

import com.ipiecoles.java.java350.repository.EmployeRepository;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //Junit 4
@ExtendWith(SpringExtension.class) //Junit 5
@DataJpaTest // ou @SpringBootTest
public class EmployeRepositoryTest {


    @Autowired
    private EmployeRepository employeRepository;

    @Test
    public void testFindLastMtriculeNominal(){
        /*
        //Given
        Vehicule v = vehiculeRepository.save(new Vehicule("AA-123-BB"));

        //When
        Vehicule result = vehiculeRepository.findByImmat("AA-123-BB");

        //Then
        Assertions.assertThat(result).isEqualTo(v);

         */
    }
}

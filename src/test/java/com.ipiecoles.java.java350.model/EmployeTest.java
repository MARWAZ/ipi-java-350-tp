package com.ipiecoles.java.java350.model;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class EmployeTest {

    @Test
    public void testNombreAnneeAncienneteNPlus1(){
        //given
        LocalDate nPlus1 = LocalDate.now().plusYears(1);
        Employe employe =new Employe();
        employe.setDateEmbauche(nPlus1);

        //when
        Integer nbAnneesAnciennete = employe.getNombreAnneeAnciennete();

        // then
        Assertions.assertThat(nbAnneesAnciennete).isEqualTo(0);

    }

}

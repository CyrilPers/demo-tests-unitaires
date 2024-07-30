package fr.diginamic.enumerations;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SaisonTest {

    @Test
    public void valueOfLibelleTest() {
        Saison result = Saison.valueOfLibelle("Printemps");
        Assertions.assertThat(result).isEqualTo(Saison.PRINTEMPS);
    }

    @Test
    public void valueOfLibelleTest2() {
        Saison result = Saison.valueOfLibelle("Eté");
        Assertions.assertThat(result).isEqualTo(Saison.ETE);
    }
}
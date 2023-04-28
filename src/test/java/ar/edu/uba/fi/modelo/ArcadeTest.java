package ar.edu.uba.fi.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class ArcadeTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }

    @Test
    public void test01JugadorPoneUnaFichaEligeWonderBoyJuega() {
        Arcade arcade = new Arcade(new WonderBoy());

        arcade.agregarFicha(1);

        String resultado = arcade.jugarA("Wonderboy");

        assertEquals(resultado, "Jugando");

    }

    @Test
    public void test02JugadorPoneDosFichaEligeWonderBoyJuega() {
        Arcade arcade = new Arcade(new WonderBoy());

        arcade.agregarFicha(2);

        String resultado = arcade.jugarA("Wonderboy");

        assertEquals(resultado, "Jugando");

    }

    @Test
    public void test03JugadorNoPusoFichasEligeWonderBoyNoJuega() {
        Arcade arcade = new Arcade(new WonderBoy());

        assertThrows(SinCredito.class, () -> {
            arcade.jugarA("Wonderboy");
        });
    }

    @Test
    public void test04JugadorAgregaDosFichasEligeMortalKombat2Juega() {
        Arcade arcade = new Arcade(new MK2());

        arcade.agregarFicha(2);

        String resultado = arcade.jugarA("MK2");

        assertEquals(resultado, "Jugando");
    }

    @Test
    public void test05JugadorAgregaUnaFichaEligeMortalKombat2NoCredito() {
        Arcade arcade = new Arcade(new MK2());

        arcade.agregarFicha(1);

        assertThrows(SinCredito.class, () -> {
            arcade.jugarA("MK2");
        });
    }

    @Test
    public void test06JugadorAgregaPesos10EligeMortalKombat2NoCredito() {
        Arcade arcade = new Arcade(new MK2());

        arcade.agregarCreditos(10);

        assertThrows(SinCredito.class, () -> {
            arcade.jugarA("MK2");
        });
    }

    @Test
    public void test07JugadorAgregaPesos30EligeKI2Juegando() {
        Arcade arcade = new Arcade(new KI2());

        arcade.agregarCreditos(30);

        String resultado = arcade.jugarA("KI2");

        assertEquals(resultado, "Jugando");
    }

    @Test
    public void test08JugadorAgregaPesos30EligeKI2Juegando() {
        Arcade arcade = new Arcade(new KI2());

        arcade.agregarCreditos("15");
        arcade.agregarCreditos("15");

        String resultado = arcade.jugarA("KI2");

        assertEquals(resultado, "Jugando");
    }
}

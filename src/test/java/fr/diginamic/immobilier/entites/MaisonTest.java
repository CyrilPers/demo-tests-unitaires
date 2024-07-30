package fr.diginamic.immobilier.entites;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MaisonTest extends TestCase {


    @Test
    public void testAjouterPiece() {
        Maison maison = new Maison();
        Chambre chambre = new Chambre(0, 10.0);
        maison.ajouterPiece(chambre);
        Assertions.assertThat(maison.getPieces().size()).isEqualTo(1);
    }

    @Test
    public void testNbPieces() {
        Maison maison = new Maison();
        Chambre chambre = new Chambre(0, 10.0);
        Salon salon = new Salon(0, 10.0);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(salon);
        Assertions.assertThat(maison.nbPieces()).isEqualTo(2);
    }
    @Test
    public void testSuperficieEtage() {
        Maison maison = new Maison();
        Chambre chambre = new Chambre(0, 10.0);
        Salon salon = new Salon(0, 10.0);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(salon);
        double result = maison.superficieEtage(0);
        Assertions.assertThat(result).isEqualTo(20.0);
    }
    @Test
    public void testSuperficieTypePiece() {
        Maison maison = new Maison();
        Chambre chambre = new Chambre(0, 10.0);
        Salon salon = new Salon(0, 20.0);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(salon);
        double result = maison.superficieTypePiece(Piece.TYPE_CHAMBRE);
        Assertions.assertThat(result).isEqualTo(10.0);
    }

    @Test
    public void testCalculerSurface() {
        Maison maison = new Maison();
        Chambre chambre = new Chambre(0, 10.0);
        Salon salon = new Salon(0, 20.0);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(salon);
        double result = maison.calculerSurface();
        Assertions.assertThat(result).isEqualTo(30.0);

    }
}
package fr.diginamic.immobilier.entites;

import java.util.ArrayList;
import java.util.List;

/** Représente une maison avec toutes ses pièces
 * @author DIGINAMIC
 *
 */
public class Maison {
	
	/** pieces : tableau de pièces de la maison */
	private List<Piece> pieces;
	
	/**
	 * Constructeur
	 */
	public Maison(){
		this.pieces = new ArrayList<>();
	}

	/** Ajoute une pièce à la maison
	 * @param nvPiece nouvelle pièce à ajouter
	 */
	public void ajouterPiece(Piece nvPiece) {
		pieces.add(nvPiece);
	}
	
	public int nbPieces() {
		return pieces.size();
	}

	/** Retourne la superficie d'un étage
	 * @param choixEtage choix de l'étage
	 * @return double
	 */
	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;
		for (Piece piece : pieces) {
			if (choixEtage == piece.getNumEtage())
				superficieEtage += piece.getSuperficie();
		}
		return superficieEtage;
	}
	
	/** Retourne la superficie total pour un type de pièce donné
	 * @param typePiece type de pièce
	 * @return double
	 */
	public double superficieTypePiece(Class<?> classPiece) {
		double superficie = 0;
		for (Piece piece : pieces) {
			if (classPiece!=null && classPiece.isInstance(piece)) {
				superficie += piece.getSuperficie();
			}
		}
		return superficie;
	}

	/** Retourne la surface totale
	 * @return double
	 */
	public double calculerSurface() {
		double superficieMaison = 0;
		for (Piece piece : pieces) {
			superficieMaison += piece.getSuperficie();
		}
		return superficieMaison;
	}

	/** Getter pour l'attribut pieces
	 * @return the pieces
	 */
	public List<Piece> Pieces() {
		return pieces;
	}

	public List<Piece> getPieces() {
		return pieces;
	}

}
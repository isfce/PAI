package fichierRepertoire;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Repertoire extends Element {
	// Un dictionnaire nomElement ==> un �l�ment
	private Map<String, Element> elements = new HashMap<>();

	public Repertoire(String nom, LocalDateTime date) {
		super(nom, date);
	}

	public void ajoutElem(Element elem) {
		// Rajoute l'�l�ment s'il n'existe pas (le nom) dans la map
		if (!elements.containsKey(elem.getNom()))
			elements.put(elem.getNom(), elem);
	}
/**
 * Permet de supprimer un �l�ment d'un r�pertoire
 * @param elem
 */
	public void supprimerElem(Element elem) {
		elements.remove(elem.getNom());
	}
/**
 * Suppression du r�pertoire et de son contenu
 */
	@Override
	public void supprimer() {
		//supprime tous les �l�ments du r�pertoire
		elements.forEach((k, e) -> e.supprimer());
		elements.clear();// vide la map
		// suppression du r�pertoire
		System.out.println("Suppression du " + toString());
	}

	@Override
	public void executer() {
		System.out.println("Contenu du "+toString());
		elements.forEach((k, e) -> System.out.println(" " + e.toString()));
		System.out.println("--------------------");
	}

	@Override
	public String toString() {
		return "Repertoire " + super.toString();
	}

}

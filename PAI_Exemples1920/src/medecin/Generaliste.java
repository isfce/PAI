package medecin;
/**
 * Exemple pour expliquer le relation d'h�ritage
 * et le polymorhisme
 * @author Didier
 * @version 2 
 */
public class Generaliste {
 public void suturer() {
	 System.out.println("Je suture comme un g�n�raliste");
 }
 public void prendreTension() {
	 System.out.println("Je prends la tension comme un g�n�raliste");
 }
 
 public void operer() {
	 throw new UnsupportedOperationException("Je ne sais pas op�rer");
 }
 
}

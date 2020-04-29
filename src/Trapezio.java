/**
 * ver 1
 * 
 * <h1><u>Classe Trapezio</u></h1>
 * 
 * @author <mark>Francesco Giuri</mark>
 *
 */
public class Trapezio {
	
	//attributi
	private float baseMaggiore, baseMinore, lato1, lato2, altezza;

	/**
	 * Costruttore della classe Trapezio
	 * @param baseMaggiore 	la base maggiore
	 * @param baseMinore	la base minore
	 * @param lato1
	 * @param lato2
	 * @param altezza
	 */
	public Trapezio(float baseMaggiore, float baseMinore, float lato1, float lato2, float altezza) {
		this.baseMaggiore = baseMaggiore;
		this.baseMinore = baseMinore;
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.altezza = altezza;
	}

	/**
	 * Calcola l'area del trapezio
	 * @return <b>Area del Trapezio</b>
	 */
	public float calcolaArea() {
		return ((baseMaggiore + baseMinore) * altezza) / 2;
	}

	/**
	 * 
	 * Metodo <b>main</b> per il test di classe
	 */
	public static void main(String[] args) {
		Trapezio t=new Trapezio(20, 10, 5, 5, 4);
		System.out.println("L'area del trapezio è: "+t.calcolaArea());
	}

}

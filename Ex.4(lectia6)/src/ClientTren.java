
public class ClientTren {

	public static void main(String[] args) {

		Vagon vagon1 = new VagonCalatoriA();
		Vagon vagon2 = new VagonCalatoriB();
		Vagon vagon3 = new VagonMarfa();
		Vagon vagon4 = new VagonMarfa();
		
		Vagon[] vagoane = {vagon1, vagon2, vagon3};
		
		
		Tren tren1 = new Tren(vagoane);
		
		Tren tren2 = new Tren(new Vagon[] {vagon1, vagon2, vagon3});
		tren1.afisareTipVagoane();
		System.out.println(vagon1.getCapacitateColete() + " " + ((VagonCalatoriA)vagon1).capacitatePasageri);
		if(tren1.equals(tren2))
			System.out.println("Egale");
		else 
			System.out.println("Nu sunt egale");
	}
}

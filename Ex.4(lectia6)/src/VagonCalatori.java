
public abstract class VagonCalatori extends Vagon {

	public int capacitatePasageri;
	
	public void deschidereUsi()
	{
		System.out.println("Usile s-au deschise");
	}
	public void inchidereUsi() 
	{
		System.out.println("Usile s-au inchis");
	}
	
	public int getCapacitateColete() {
		return capacitateColete;
	}
	public abstract String tipVagon();
}

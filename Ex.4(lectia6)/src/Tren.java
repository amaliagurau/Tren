
public class Tren {

	private Vagon[] vagoane = new Vagon[15];
	
	public Tren(Vagon[] vagoane) {
		super();
		this.vagoane = vagoane;
	}

	public boolean equals(Tren tren)
	{
		int capacitateTotala1 = 0;
		int capacitateTotala2 = 0;
		
	for(int i=0; i<this.vagoane.length; i++)
	{
		capacitateTotala1 = capacitateTotala1 + this.vagoane[i].getCapacitateColete();	
	}
	for(int i=0; i<tren.vagoane.length; i++)
	{
		capacitateTotala2 = capacitateTotala2 + tren.vagoane[i].getCapacitateColete();		
    }

	if(capacitateTotala1==capacitateTotala2)
		return true;
	else 
			return false;
}

	public void afisareTipVagoane()
	{
		for(int i=0;i<this.vagoane.length; i++)
		{
			System.out.println(this.vagoane[i].tipVagon());
		}
	}
}
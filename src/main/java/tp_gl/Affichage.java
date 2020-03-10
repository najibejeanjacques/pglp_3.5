package tp_gl;

import java.time.LocalDate;

public abstract class Affichage
{
	public void Debut()
	{
		System.out.println(LocalDate.now()+" Debut de uneMethodeMetier");
	}
	public void FIn()
	{
		System.out.println(LocalDate.now()+" Fin de uneMethodeMetier");
	}
	
}

package tp_gl;

import java.time.LocalDateTime;

public class UneClasseMetier {

	public void uneMethodeMetier(Traitement traitement, LocalDateTime local)
	{
		System.out.println(local.now()+" Debut de uneMethodeMetier");//log message
		traitement.start();
		System.out.println(local.now()+" Fin de uneMethodeMetier"); //log message
	}
	
}

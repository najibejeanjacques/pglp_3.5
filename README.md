# pglp_3.5

1) Ce code ne repsecte pas le principe DIP car:
La classe UneClasseMetier (qui a un comportement particulier) qui est un détail ne doit pas déprendre des traitements métiers liés.


2) Proposons une solution respectant DIP:

-Nous allons créer la classe abstraite Affichage qui ne fait qu'afficher:

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

-Créons la classe UneClasseMetierqui se chargera de faire un traitement particuler avec affichage:

      
            public classe UneClasseMetier extens Affichage
            {
                  public void uneMethodeMetier(Taitement traitement)
                  {
                        
                        Debut();
                        //Traitement particulier a faire
                        Fin();
                  }
            }

# pglp_3.5

1) Ce code ne repsecte pas le principe DIP car:
La classe UneClasseMetier (qui a un comportement particulier) qui est un détail ne doit pas déprendre des traitements métiers liés.


2) Proposons une solution respectant DIP:

-Nous allons créer la classe Traitement qui fait un traitement particulier qui implementera la classe DisplayMessage qui ne fait que afficher:

        public class Traitement 
        {
           public void start()
           {
                  //Traitement associé
           }
        }

-Créons la classe abstraite DisplayMessage qui se chargera d'afficher des messages:

      
            public classe UneClasseMetier
            {
                  public void uneMethodeMetier(Taitement traitement)
                  {
                        System.out.println(Localmessage+"Début du Traitement");
                        traitement.start();
                        System.out.println(Localmessage+"FIn du Traiement");
                  }
            }

# pglp_3.5

1) Ce code ne repsecte pas le principe DIP car:
La classe UneClasseMetier (qui a un comportement particulier) qui est un détail ne doit pas déprendre des traitements métiers liés.


2) Proposons une solution respectant DIP:
-Créons la classe abstraite DisplayMessage qui se chargera d'afficher des messages:

      
            public interface DisplayMessage
            {
                  public void display(String message)
                  {
                        System.out.println(Localmessage+message);
                  }
            }

-Nous allons créer la classe Traitement qui fait un traitement particulier qui implementera la classe DisplayMessage qui ne fait que afficher:

        public class Traitement implements DisplayMessage
        {
            display("Début du Traitement");
            //Traitement 
            display("FIn du Traiement");
        }

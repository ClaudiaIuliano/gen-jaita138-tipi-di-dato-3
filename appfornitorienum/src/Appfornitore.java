import java.util.Scanner;




public class Appfornitore {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        boolean cont=s;
        
            while (cont) {
                
            System.out.println("Inserisci le informazioni relative al tuo fornitore");


            System.out.println("Nome");
            String nome=sc.nextLine();

            System.out.println("Tipologia");
            System.out.println("0-PIANTE");
            System.out.println("1-VASELLAME");
            System.out.println("2-CONCIME");
            System.out.println("3-GIARDINAGGIO");
            byte tipologiaNum=sc.nextByte();
            TipologiaArticoli tipologiaArticoli= TipologiaArticoli.values()[tipologiaNum];

            System.out.println("Partita Iva");
            String partitaIva= sc.nextLine();

            System.out.println("Luogo");
            String luogo= sc.nextLine();

            System.out.println("Lingua Principale");
            String linguaPrincipale= sc.nextLine();

            System.out.println("Telefono");
            String telefono= sc.nextLine();

            System.out.println("Note");
            String note= sc.nextLine();

            System.out.println("Mail");
            String mail= sc.nextLine();

            System.out.println("Iban");
            String iban= sc.nextLine();

            System.out.println("Nome Referente");
            String nomeReferente= sc.nextLine();

            
            
            

            System.out.println("Ecco tutte le informazioni ");
            
            
            System.out.println("Nome:"+nome);
            System.out.println("Partita Iva:"+ partitaIva);
            System.out.println("Luogo:"+ luogo);
            System.out.println("Lingua Principale"+ linguaPrincipale);
            System.out.println("Telefono"+ telefono);
            System.out.println("Mail:"+ mail);
            System.out.println("Iban:"+ iban);
            System.out.println("Nome Referente:"+ nomeReferente );

            System.out.println("vuoi inserire un altro fornitore?(s/n):");
            cont=sc.nextBoolean();
            
            
            }
            sc.close();
        }
            
    }
            
            
            
            
        
        

    


        
        

        
    


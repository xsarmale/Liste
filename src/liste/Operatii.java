package liste;

import java.util.Scanner;
/**
 *
 * @author boral
 */
class Operatii {
    
    static int max=100;
    static int n;
    static int [] a=new int[max];
    
    public Operatii(int n)
    {
        this.n =n;
        int op;
        
        do{
            System.out.println("1. Adaugare element in lista");
            System.out.println("2. Inserare element in lista");
            System.out.println("3. Stergere element in lista");
            System.out.println("4. Cautare element in lista"); 
            System.out.println("5. Afisare lista");
            System.out.println("6. Exit");
   
            System.out.println("Dati optiunea dorita");
   
            Scanner input = new Scanner(System.in);
            op = input.nextInt();

            if(op==1) adaugare();
            if(op==2) inserare();
            if(op==3) stergere();
            if(op==4) cautare();
            if(op==5) afisare();

        } while(op != 6);
    }
    
    public static void adaugare()
    {
        if(n==max) System.out.println("Lista este plina");
        else{
            System.out.println("Dati valoarea adaugata");
            Scanner input = new Scanner(System.in);
            int valoare = input.nextInt();
            n++;
            a[n]=valoare;
        }
    }
    public static void inserare()
    {
        int i,valoarea,poz;
        
        if(n==max) System.out.println("Lista este plina");
        else{
            System.out.println("Dati pozitia de inserare");
            Scanner input = new Scanner(System.in);
            poz=input.nextInt();
            System.out.println("Dati valoarea de inserare");
            valoarea=input.nextInt();
            for(i = n;i>poz;i--)
            {
                a[i]=a[i-1];
            }
            a[poz] = valoarea;
            n=n+1;
        }
    }
    
    public static void stergere()
    {
         int i,poz;
         if( n==max ) System.out.println("Lista plina");
         else{
             System.out.println("Dati pozitia de sters");
             Scanner input = new Scanner(System.in);
             poz = input.nextInt();
    
             for(i=poz;i<=n-1;i++)
                a[i]=a[i+1];
             n--;
         }
     }
    
    private static void cautare()
     {
         int valoare, i, poz = 0, gasit = 0;
  
          if(n==0) System.out.println("Lista vida");
          else{
             System.out.println("Dati valoare de cautare");
             Scanner input = new Scanner(System.in);
             valoare = input.nextInt();
   
             for(i = 1; i<=n;i++)
                 {
                   if(a[i] == valoare)
                    {
                     gasit = i;
                     poz=i;
                    }
                 }
   
             if(gasit == 0) System.out.println("Valoarea "+valoare+" nu sa gasit");
             else  System.out.println("Valoarea "+valoare+" sa gasit pe pozitia "+poz);

             }
     }
    
    public static void afisare()
     {
         int i;
         
         if( n==0 ) System.out.println("Lista este vida");
         else{
             System.out.println("Liste este: ");
             for( i=1;i<=n;i++)
              {
                 System.out.println(a[i]+" ");
              }
         }
         
         System.out.println();
     }

}

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);

        System.out.println("Skriv in en text: ");
        String text = tangentbord.nextLine();
        int antal_bokstäver = text.length();
        System.out.println("Du skrev "+antal_bokstäver+" bokstäver");

        System.out.println("ange din bokstav ");
        String tecken = tangentbord.nextLine();
        int plats = text.indexOf(tecken);
        plats = plats + 1;
        System.out.println("Bokstaven "+tecken+ " är " +plats+" i texten");

        System.out.print("ange startplats: ");
        int start= tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("ange slutposition: ");
        int steg_fram= tangentbord.nextInt();
        tangentbord.nextLine();
        String del_sträng = text.substring(start,steg_fram);
        System.out.println(del_sträng);

        System.out.println("ange din text bit som du vill veta om den är sant eller falskt: ");
        String b = tangentbord.nextLine();
        boolean A = text.contains(b); 
        System.out.println(A);

        System.out.println("ange din nya text");
        String nyastring = tangentbord.nextLine();
        System.out.println("ange den delen i den gamla texten du vill byta ut det med");
        String gamlastring = tangentbord.nextLine();
        String bytastring = text.replace(gamlastring,nyastring);
        System.out.println(bytastring);
        
        

    }
}
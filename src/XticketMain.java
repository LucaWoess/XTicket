import java.util.Scanner;

public class XticketMain 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		PaP2 pap2 = new PaP2();
		System.out.println("Hallo");
		System.out.print("Welche Art der Veranstaltug möchten sie besuchen(Konzert,Theater,Sport): ");
		String Veranstaltungsart = Sc.nextLine();
		if(Veranstaltungsart.equals("Konzert"))
		{
			System.out.print("Wo möchten Sie das Konzert besuchen(Innsbruck/München): ");
			String Veranstaltungsort = Sc.nextLine();
			System.out.print("Was für eine Art von Ticket möchten Sie erwerben(Stehplatz,Sitzplatz,VIP): ");
			String Ticketart = Sc.nextLine();
			pap2.berechneTicketpreis(Veranstaltungsort, 40, Ticketart);
			pap2.ausgabe(Veranstaltungsort, Ticketart);
		}
		
		if(Veranstaltungsart.equals("Theater"))
		{
			System.out.print("Wo möchten Sie das Konzert besuchen(Innsbruck/München): ");
			String Veranstaltungsort = Sc.nextLine();
			System.out.print("Was für eine Art von Ticket möchten Sie erwerben(Stehplatz,Sitzplatz,VIP): ");
			String Ticketart = Sc.nextLine();
			pap2.berechneTicketpreis(Veranstaltungsort, 40, Ticketart);
			pap2.ausgabe(Veranstaltungsort, Ticketart);
		}
		
		if(Veranstaltungsart.equals("Sport"))
		{
			System.out.print("Wo möchten Sie das Konzert besuchen(Innsbruck/München): ");
			String Veranstaltungsort = Sc.nextLine();
			System.out.print("Was für eine Art von Ticket möchten Sie erwerben(Sitzplatz,VIP): ");
			String Ticketart = Sc.nextLine();
			pap2.berechneTicketpreis(Veranstaltungsort, 40, Ticketart);
			pap2.ausgabe(Veranstaltungsort, Ticketart);
		}
	}
}

abstract class Tickets
{
	String veranstaltungsort;
	String veranstaltungsart;
	String veranstaltungsname;
	String ticketart;
	int basispreis;
	int ticketpreis;
	
	abstract void berechneTicketpreis();
	abstract void abfrage();
	public ausgabe()
	{
		String ausgabe;
		ausgabe = "Veranstaltungsart: "+veranstaltungsart+"\n";
		ausgabe += "Veranstaltungsname: "+veranstaltungsname+"\n";
		ausgabe += "Veranstaltungsort: "+veranstaltungsort+"\n";
		ausgabe += "ticketart: "+ticketart+"\n";
		ausgabe += "Ticketpreis: "+ticketpreis+"\n";
		System.out.println(ausgabe);
	}
}

abstract class Konzert extends Tickets
{
	public void abfrage()
	{
		System.out.println("Wir bieten folgende Konzertarten an:\n -Palmen aus Plastik 2 (RAF CAMORA x BONEZ MC)\n -WAVE (Ufo 361)\n\n");
	}
}

abstract class Sport extends Tickets
{

}

abstract class Theater extends Tickets
{

}

class PaP2 extends Konzert
{
	int Ticketpreis;
	public class berechneTicketpreis(String Veranstaltungsort, int Basispreis, String Ticketart) 
	{
		if(Ticketart.equals("Stehplatz"))
		{
			Ticketpreis = Basispreis + 10;
		}
		if(Ticketart.equals("Sitzplatz"))
		{
			Ticketpreis = Basispreis + 20;
		}
		if(Ticketart.equals("VIP"))
		{
			Ticketpreis = Basispreis + 100;
		}
	}

	public void ausgabe(String Veranstaltungsort, String Ticketart) 
	{
		System.out.println("Ein "+Ticketart+"-Ticket für das Pap2-Konzert in "+Veranstaltungsort+" kostet "+Ticketpreis+"€.");
	}
}
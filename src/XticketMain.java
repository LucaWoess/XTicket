import java.util.Scanner;

public class XticketMain 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		PaP2 pap2 = new PaP2();
		String Veranstaltungsart = Sc.next();
		System.out.println("Welche Art der Veranstaltug möchten sie besuchen(Konzert,Theater,Sport): ");
		if(Veranstaltungsart.equals("Konzert"))
		{
			String Veranstaltungsort = Sc.next();
			System.out.println("Wo möchten Sie das Konzert besuchen(Innsbruck/München): ");
			String Ticketart = Sc.next();
			System.out.println("Was für eine Art von Ticket möchten Sie erwerben(Stehplatz,Sitzplatz,VIP): ");
			pap2.berechneTicketpreis(Veranstaltungsort, 40, Ticketart);
			pap2.ausgabe(Veranstaltungsort, Ticketart);
		}
	}
}

abstract class Tickets
{
	abstract void berechneTicketpreis(String Veranstaltungsort,int Basispreis,String Ticketart); //Ticketart ... Steh-/Sitzplatz/VIP
}

abstract class Konzert extends Tickets
{
	//abstract void berechneTicketpreis();
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
	@Override
	void berechneTicketpreis(String Veranstaltungsort, int Basispreis, String Ticketart) 
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
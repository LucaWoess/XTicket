import java.util.Scanner;

public class XticketMain 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		PaP2 pap2 = new PaP2();
		System.out.println("Hallo");
		System.out.println("Welche Art der Veranstaltug m�chten sie besuchen(Konzert,Theater,Sport): ");
		String Veranstaltungsart = Sc.nextLine();
		if(Veranstaltungsart.equals("Konzert"))
		{
			System.out.println("Wo m�chten Sie das Konzert besuchen(Innsbruck/M�nchen): ");
			String Veranstaltungsort = Sc.nextLine();
			System.out.println("Was f�r eine Art von Ticket m�chten Sie erwerben(Stehplatz,Sitzplatz,VIP): ");
			String Ticketart = Sc.nextLine();
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
		System.out.println("Ein "+Ticketart+"-Ticket f�r das Pap2-Konzert in "+Veranstaltungsort+" kostet "+Ticketpreis+"�.");
	}
}
package endterm;

public class Hotel extends Apartment implements Booked  {
	public Hotel() {
		super();
	}
	public Hotel(String name, int apartmentId, String addres, String phone) {
		super(name, apartmentId, addres, phone);
	}
	@Override
	public void voice() {
		System.out.println("Добро пожаловать в Отель");
	}
	@Override
	public String toString() {
        return super.toString() + " Class Hotel";
    }
	
	public void bookedHappy() {
		System.out.println("This hotel can booked");
	}
}

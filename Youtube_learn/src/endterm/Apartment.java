package endterm;

import java.util.Objects;

abstract public class Apartment {
	private String name;
	private int apartmentId;
	private String addres;
	private String phone;
	
	public Apartment(String name, int apartmentId, String addres, String phone) {
		this.name = name;
		this.apartmentId = apartmentId;
		this.addres = addres;
		this.phone = phone;
	}
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }
    public static int rating(int a, int b, int c) {
    	return ((a + b + c) / 3);
    }
    public static int rating(int a, int b) {
    	return ((a + b) / 2);
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public abstract void voice();
    
    @Override
    public String toString() {
        return "Apartment{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", addres='" + addres + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Apartment apartment1 = (Apartment) o;
        return (this.name == apartment1.name) && (this.phone.equals(apartment1.phone))
                && (this.addres.equals(apartment1.addres));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


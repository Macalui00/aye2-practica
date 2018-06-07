package Practica7parte4;

import java.util.ArrayList;

public class AgendaTelefonica {
	private ArrayList<Contacto> contactos;
	
	public AgendaTelefonica() {
		
	}
	
	public AgendaTelefonica(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	public void buscarContacto(String nombre) {
		boolean existe = false;
		for(Contacto c: contactos) {
			if (c.getNombre() == nombre) {
				System.out.println("Direccion: " + c.getDireccion() + ", telefono: " + c.getTelefono());
				existe = true;
			}
		}
		if (!existe) {
			System.out.println("No existe el contacto llamado: " + nombre);
		}
	}
	
	public static void main(String[] args) {
		Contacto c1 = new Contacto("Gabriel", "Rivadavia", 44327890);
		Contacto c2 = new Contacto("Mariana", "Acoyte", 49017901);
		ArrayList<Contacto> contactos = new ArrayList<>();
		contactos.add(c1);
		contactos.add(c2);
		AgendaTelefonica agenda = new AgendaTelefonica(contactos);
		agenda.buscarContacto("Gabriel");
		agenda.buscarContacto("miriam");
	}
	
}

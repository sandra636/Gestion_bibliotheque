package co.kozao.bibliotheque.model;

public class Manage {
	private int id;
	private int idLibrarian;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdLibrarian() {
		return idLibrarian;
	}
	@Override
	public String toString() {
		return "Manage [id=" + id + ", idLibrarian=" + idLibrarian + "]";
	}
	public Manage(int id, int idLibrarian) {
		super();
		this.id = id;
		this.idLibrarian = idLibrarian;
	}
	public void setIdLibrarian(int idLibrarian) {
		this.idLibrarian = idLibrarian;
	}

}

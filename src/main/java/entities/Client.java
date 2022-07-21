package entities;

public class Client {
	private String name;
	private String cpf;
	private String dateOfBirth;

	public Client(String name, String cpf, String dateOfBirth) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
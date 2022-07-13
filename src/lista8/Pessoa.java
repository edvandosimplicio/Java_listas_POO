package lista8;

public class Pessoa {

    private String name, address, phone;

    // construtor padrão
    public Pessoa() {}
    // construtor opção 1
    public Pessoa(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    // construtor opção 2
    public Pessoa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
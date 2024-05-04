public class users {

    int id;
    String name;
    String dni;
    String adress;
    String location;
    int type;
    String password;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public String getAdress() {
        return adress;
    }

    public String getLocation() {
        return location;
    }

    public int getType() {
        return type;
    }

    public String getPassword() {
        return password;
    }

    public users(int id,String name,String dni,String location,String adress,int type,String password)
        {
            this.id = id;
            this.name = name;
            this.dni = dni;
            this.location = location;
            this.adress = adress;
            this.type = type;
            this.password = password;
        }
}

import java.util.ArrayList;
import java.util.Date;

public class Adherent {
    private String name;
    private String secondName;
    private String address;
    private String email;
    private ArrayList<Volume> loans;
    private Date adhesionDate;
    private boolean registered;

    public Adherent(String name, String secondName, String address, String email, Date adhesionDate) {
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.email = email;
        this.adhesionDate = adhesionDate;
        registered = true;
        this.loans = new ArrayList<Volume>();
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Date getAdhesionDate() {
        return adhesionDate;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public void addLoan(Volume volume) {
        if (loans.size() >= 4) System.out.println("Il y a déjà 4 réservations.\n");
        else loans.add(volume);
    }

    public void delLoan(int index) {
        loans.remove(index);
    }

    public void clearLoans() {
        loans.clear();
    }

    public String getLoans() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < loans.size(); ++i) str.append(loans.get(i).toString());
        return str.toString();
    }
}

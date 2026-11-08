import java.util.Date;

public class Volume extends Document {
    private String author;
    private Date restitutionDate;

    public Volume (String title, int numero,String author,Date restitutionDate) {
        super(title,numero);
        this.author = author;
        this.restitutionDate = restitutionDate;
    }

    public String getAuthor() {
        return author;
    }

    public Date getRestitutionDate() {
        return restitutionDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRestitutionDate(Date restitutionDate) {
        this.restitutionDate = restitutionDate;
    }

    @Override
    public String toString() {
        return super.toString() + "| Volume{" +
                "author='" + author + '\'' +
                ", restitutionDate=" + restitutionDate +
                '}';
    }
}

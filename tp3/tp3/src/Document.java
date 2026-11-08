public class Document {
    private int numero;
    private String title;

    public Document(String title, int numero) {
        this.title = title;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitle() {
        return title;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "numero=" + numero +
                ", title='" + title + '\'' +
                '}';
    }
}

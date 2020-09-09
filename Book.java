
public class Book {
    public static void main(String[] args) {

       Book g = new Book();
       g.set_Year(1996);
       g.set_Author("Виктор Пелевин");
       g.set_Izd("Вагриус");
       g.set_Name("Петр и Пустота");
       g.set_Cout(500);
      System.out.println( g.toString());


    }
}

class inf {
    private String author;
    private String name;
    private String izd;
    private int cout;
    private int year;

    public void set_Author(String auth) {
        this.author = auth;


    }

    public void set_Name(String type) {
        this.name = type;

    }

    public void set_Izd(String izd) {
        this.izd = izd;

    }

    public void set_Cout(int cout) {
        this.cout = cout;

    }

    public void set_Year(int yea) {
        this.year = yea;

    }

    public String get_Author() {

        return author;

    }

    public String get_Izd() {

        return izd;

    }

    public int get_Cout() {

        return cout;
    }

    public int get_Year() {

        return year;
    }

    @Override
    public String toString() {
        return "Книга{" +
                "Автор=" + author + '\'' +
                ", Название=" + name + '\'' +
                " Издательство=" + izd + '\'' +
                ", Кол во страниц=" + cout +
                ", год=" + year +
                '}';
    }

    public void toStr() {

        System.out.println("Автор: " + author + "\n" + "Издательство: " + izd + "\n" + "Страниц " + cout + "|" + "Год выхода:" + year);
    }
}


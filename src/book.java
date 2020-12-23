import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public final class book implements Comparable, Serializable {
    private final String name;
    private final String genre;
    private final Date WriteDate;
    private final int price;

    public book (String name, String genre, Date WriteDate, int price)
    {
        this.name = name;
        this.genre = genre;
        this. WriteDate = WriteDate;
        this.price = price;
    }

    public String getName ()
    {
        return this.name;
    }

    public String getGenre() {
        return genre;
    }

    public Date WriteDate() {
        return WriteDate;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash (name, genre, WriteDate, price);
    }

    @Override
    public boolean equals (Object object)
    {
        if (this == object)
        {
            return true;
        } else if ((object == null) || (getClass () != object.getClass ()))
        {
            return false;
        }

        book books = (book) object;
        return hashCode () == books.hashCode ();
    }

    @Override
    public book clone () throws CloneNotSupportedException
    {
        return (book) super.clone ();
    }

    @Override
    public int compareTo (Object b)
    {
        book bk = (book) b;

        if (bk.equals (this)) { return 1; }
        return 0;
    }

}

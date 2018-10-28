package education.homework.task1.book;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty; //default = 0

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = new Author[authors.length];
        System.arraycopy(authors, 0, this.authors, 0, authors.length);
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = new Author[authors.length];
        System.arraycopy(authors, 0, this.authors, 0, authors.length);
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name = '" + name + '\'' +
                ", authors = " + Arrays.toString(authors) +
                ", price = " + price +
                ", qty = " + qty +
                ']';
    }

    public String getAuthorNames() {
        if (authors.length == 1) {
            return authors[0].getName();
        } else {
            StringBuilder strAuthorNames = new StringBuilder();

            for (Author a :
                    authors) {
                strAuthorNames.append(a.getName()).append(',');
            }
            strAuthorNames.deleteCharAt(strAuthorNames.length() - 1); //delete last ','

            return strAuthorNames.toString();
        }
    }

}

import java.util.Objects;

record Book(String title, String author, int publicationYear, double price) implements Comparable<Book>{
    public Book(String title, String author, int publicationYear, double price){
        this.title = Objects.requireNonNull(title);
        this.author = Objects.requireNonNull(author);
        this.publicationYear = publicationYear;
        this.price = price;
    }

    @Override
    public int compareTo(Book other){
        if (this.publicationYear != other.publicationYear){
            return Integer.compare(this.publicationYear, other.publicationYear);
        } else if (this.price != other.price){
            return Double.compare(this.price, other.price);
        } else if (!this.author.equals(other.author)){
            return this.author.compareTo(other.author);
        } else {
            return this.title.compareTo(other.title);
        }
    }
    /*
    @Override
    public int compareTo(Book other){
        int yearComparison = Integer.compare(this.publicationYear, other.publicationYear);
        if (yearComparison != 0) return yearComparison;

        int priceComparison = Double.compare(this.price, other.price);
        if (priceComparison != 0) return priceComparison;

        int authorComparison = this.author.compareTo(other.author);
        if (authorComparison != 0) return authorComparison;

        int titleComparison = this.title.compareTo(other.title);
        return titleComparison;

    }*/
}

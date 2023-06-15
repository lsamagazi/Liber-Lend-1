package za.ac.cput.domain.impl;

// notes. might need lists for relatedGenre, exampleBook

public class Genre {
    private int genreId;
    private String genreName;
    private String description;
    private Genre relatedGenre;
    private Book exampleBook;

    public Genre(Builder builder) {
        this.genreId = builder.genreId;
        this.genreName = builder.genreName;
        this.description = builder.description;
        this.relatedGenre = builder.relatedGenre;
        this.exampleBook = builder.exampleBook;
    }

    public int getGenreId() {
        return genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public String getDescription() {
        return description;
    }

    public Genre getRelatedGenre() {
        return relatedGenre;
    }


    public Book getExampleBook() {
        return exampleBook;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId='" + genreId + '\'' +
                ", genreName='" + genreName + '\'' +
                ", description='" + description + '\'' +
                ", relatedGenre=" + relatedGenre +
                ", exampleBook=" + exampleBook +
                '}';
    }

    public static class Builder {
        private int genreId;
        private String genreName;
        private String description;
        private Genre relatedGenre;
        private Book exampleBook;

        public Builder setGenreId(int genreId) {
            this.genreId = genreId;
            return this;
        }

        public Builder setGenreName(String genreName) {
            this.genreName = genreName;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setRelatedGenre(Genre relatedGenre) {
            this.relatedGenre = relatedGenre;
            return this;
        }

        public Builder setExampleBook(Book exampleBook) {
            this.exampleBook = exampleBook;
            return this;
        }

        public Builder copy(Genre genre) {
            this.genreId = genre.genreId;
            this.genreName = genre.genreName;
            this.description = genre.description;
            this.relatedGenre = genre.relatedGenre;
            this.exampleBook = genre.exampleBook;
            return this;
        }

        public Genre Build() {
            return new Genre(this);
        }
    }
}

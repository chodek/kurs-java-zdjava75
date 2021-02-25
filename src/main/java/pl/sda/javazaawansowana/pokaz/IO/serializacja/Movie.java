package pl.sda.javazaawansowana.pokaz.IO.serializacja;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Movie implements Serializable {

    private final Director director;
    private final String title;
    private final String subTitle;
    private final int releaseYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseYear == movie.releaseYear && Objects.equals(title, movie.title) && Objects.equals(subTitle, movie.subTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, subTitle, releaseYear);
    }


}

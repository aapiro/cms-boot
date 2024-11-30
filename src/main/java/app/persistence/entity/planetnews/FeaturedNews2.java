package app.persistence.entity.planetnews;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FeaturedNews2 {

    private String title;
    private String imageUrl;
    private String category;
    private String categoryUrl;
    private String date;
    private String dateUrl;
    private String newsUrl;
    private String summary;
    private String author;
    private String authorImage;
    private int views;
    private int comments;
}

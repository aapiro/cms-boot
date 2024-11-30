package app.persistence.entity.planetnews;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BreakingNews {
    private String title;
    private String url;
}

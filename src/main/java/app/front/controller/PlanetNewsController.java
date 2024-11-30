package app.front.controller;

import app.config.anotation.FrontController;
import app.persistence.entity.planetnews.BreakingNews;
import app.persistence.entity.planetnews.FeaturedNews;
import app.persistence.entity.planetnews.FeaturedNews2;
import app.persistence.entity.planetnews.MenuItem;
import app.persistence.entity.planetnews.News;
import app.persistence.entity.planetnews.SocialLink;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FrontController
public class PlanetNewsController {

    @GetMapping("/news")
    public String index(Model model) {
        // Título del sitio
        model.addAttribute("siteTitle", "BizNews - Free News Website");

        // Fecha actual
        model.addAttribute("currentDate", "Monday, January 1, 2045");

        // Redes sociales
        List<SocialLink> socialLinks = Arrays.asList(
                new SocialLink(1L,"", "fab fa-twitter"),
                new SocialLink(2L,"", "fab fa-linkedin-in"),
                new SocialLink(3L,"", "fab fa-instagram"),
                new SocialLink(4L,"", "fab fa-google-plus-g"),
                new SocialLink(5L,"", "fab fa-youtube"),
                new SocialLink(6L,"", "fab fa-facebook-f")
        );
        model.addAttribute("socialLinks", socialLinks);

        // Menú principal
        List<MenuItem> menuItems = Arrays.asList(
                new MenuItem(1L,"Home", "/"),
                new MenuItem(2L,"Category", "/category"),
                new MenuItem(3L,"Single News", "/singlenews"),
                new MenuItem(4L,"Contact", "/contact")
        );
        model.addAttribute("menuItems", menuItems);

        // Noticias destacadas
        List<News> news = new ArrayList<>();
        news.add(new News(
                1L,
                "Lorem ipsum dolor sit amet elit. Proin vitae porta diam...",
                "img/news-800x500-1.jpg",
                "Business",
                "/category/business",
                "Jan 01, 2045",
                "/article/1"
        ));
        news.add(new News(
                2L,
                "Another article example...",
                "img/news-800x500-2.jpg",
                "Technology",
                "/category/technology",
                "Jan 02, 2045",
                "/article/2"
        ));
        news.add(new News(
                3L,
                "Yet another interesting article...",
                "img/news-800x500-3.jpg",
                "Lifestyle",
                "/category/lifestyle",
                "Jan 03, 2045",
                "/article/3"
        ));

        model.addAttribute("featuredNews", news);

        // Noticias pequeñas
        List<News> smallNews = Collections.singletonList(
                new News(1L, "Small News Title", "img/news-700x435-1.jpg", "Health", "/category/health", "Jan 02, 2045", "/news/2")
        );
        model.addAttribute("smallNews", smallNews);
        model.addAttribute("adImage", "img/ads-728x90.png");
        model.addAttribute("breakingNewsTitle", "Breaking News");

        // Lista de noticias destacadas
        List<BreakingNews> breakingNews = Arrays.asList(
                new BreakingNews("Lorem ipsum dolor sit amet elit.", "/news/1"),
                new BreakingNews("Proin interdum lacus eget ante tincidunt.", "/news/2")
        );
        model.addAttribute("breakingNews", breakingNews);

        model.addAttribute("featuredNewsTitle", "Featured News");

        // Lista de noticias destacadas
        List<FeaturedNews> featuredNews = Arrays.asList(
                new FeaturedNews("Lorem ipsum dolor sit amet elit...", "/img/news-700x435-1.jpg", "Business", "/category/business", "Jan 01, 2045", "/date/2045-01-01", "/news/1"),
                new FeaturedNews("Lorem ipsum dolor sit amet elit...", "/img/news-700x435-2.jpg", "Business", "/category/business", "Jan 01, 2045", "/date/2045-01-01", "/news/2"),
                new FeaturedNews("Lorem ipsum dolor sit amet elit...", "/img/news-700x435-3.jpg", "Business", "/category/business", "Jan 01, 2045", "/date/2045-01-01", "/news/3"),
                new FeaturedNews("Lorem ipsum dolor sit amet elit...", "/img/news-700x435-4.jpg", "Business", "/category/business", "Jan 01, 2045", "/date/2045-01-01", "/news/4"),
                new FeaturedNews("Lorem ipsum dolor sit amet elit...", "/img/news-700x435-5.jpg", "Business", "/category/business", "Jan 01, 2045", "/date/2045-01-01", "/news/5")
        );
        model.addAttribute("featuredNews", featuredNews);

        List<FeaturedNews2> featuredNews2 = Arrays.asList(
                new FeaturedNews2("Lorem ipsum dolor sit amet elit...", "/img/news-700x435-1.jpg", "Business", "/category/business",
                        "Jan 01, 2045", "/date/2045-01-01", "/news/1", "Dolor lorem eos dolor duo et eirmod sea...",
                        "John Doe", "/img/user.jpg", 12345, 123),
                new FeaturedNews2("Lorem ipsum dolor sit amet elit...", "/img/news-700x435-2.jpg", "Business", "/category/business",
                        "Jan 01, 2045", "/date/2045-01-01", "/news/2", "Dolor lorem eos dolor duo et eirmod sea...",
                        "Jane Doe", "/img/user.jpg", 54321, 456)
        );
        model.addAttribute("featuredNews2", featuredNews2);

        return "front/planetnews/home";
    }
}

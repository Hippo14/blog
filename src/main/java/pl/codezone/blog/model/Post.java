package pl.codezone.blog.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String article;
    private String titleClean;
    @ManyToOne
    private Author authorId;
    private Date datePublished;
    private Byte[] bannerImage;
    private Boolean featured;
    private Boolean enabled;
    private Boolean commentsEnabled;
    private Long views;
    @ManyToMany(mappedBy = "postSet")
    private Set<Category> categorySet;

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTitleClean() {
        return titleClean;
    }

    public void setTitleClean(String titleClean) {
        this.titleClean = titleClean;
    }

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author authorId) {
        this.authorId = authorId;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public Byte[] getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(Byte[] bannerImage) {
        this.bannerImage = bannerImage;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getCommentsEnabled() {
        return commentsEnabled;
    }

    public void setCommentsEnabled(Boolean commentsEnabled) {
        this.commentsEnabled = commentsEnabled;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Set<Category> getCategorySet() {
        return categorySet;
    }

    public void setCategorySet(Set<Category> categorySet) {
        this.categorySet = categorySet;
    }
}
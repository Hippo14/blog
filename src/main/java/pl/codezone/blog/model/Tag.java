package pl.codezone.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Post postId;
    private String tag;
    private String tagClean;

    public Tag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPostId() {
        return postId;
    }

    public void setPostId(Post postId) {
        this.postId = postId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTagClean() {
        return tagClean;
    }

    public void setTagClean(String tagClean) {
        this.tagClean = tagClean;
    }
}
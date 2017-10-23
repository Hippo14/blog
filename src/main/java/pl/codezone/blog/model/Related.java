package pl.codezone.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Related {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long relatedPost;

    public Related(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelatedPost() {
        return relatedPost;
    }

    public void setRelatedPost(Long relatedPost) {
        this.relatedPost = relatedPost;
    }
}
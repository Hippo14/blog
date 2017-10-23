package pl.codezone.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LikesCounter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idOfLikedPost;
    private Long ipAddress;

    public LikesCounter(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdOfLikedPost() {
        return idOfLikedPost;
    }

    public void setIdOfLikedPost(Long idOfLikedPost) {
        this.idOfLikedPost = idOfLikedPost;
    }

    public Long getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(Long ipAddress) {
        this.ipAddress = ipAddress;
    }
}

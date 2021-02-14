package ImageHoster.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "comment")
public class Comment {

	/**
	 * unique id for a comment
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	/**
	 * comment body
	 */
	@Column(columnDefinition = "TEXT", name = "text")
	private String text;

	/**
	 * date comment was created
	 */
	@Column(name = "createdDate")
	private LocalDate createdDate;

	/**
	 * user which posted the comment
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;

	/**
	 * image on which the comment was posted
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "image_id")
	private Image image;

	public Comment() {

	}

	public Integer getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}

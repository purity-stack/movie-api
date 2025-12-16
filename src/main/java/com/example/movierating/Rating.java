package model;

	import jakarta.persistence.*;
	import lombok.*;

	@Entity
	@Table(name = "ratings")
	@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
	public class Rating {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "movie_id", nullable = false)
	    private Movie movie;

	    private Long userId;        // later we can replace with real User entity

	    private Integer score;      // 1–10

	    private String review;
	
	public Rating() {
		// TODO Auto-generated constructor stub
	}

}

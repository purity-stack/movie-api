package model;


	

	import jakarta.persistence.*;
	import lombok.*;

	import java.util.ArrayList;
	import java.util.List;

	@Entity
	@Table(name = "movies")
	@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
	public class Movie {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false, unique = true)
	    private String title;

	    private Integer year;

	    private String description;

	    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Rating> ratings = new ArrayList<>();
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

}

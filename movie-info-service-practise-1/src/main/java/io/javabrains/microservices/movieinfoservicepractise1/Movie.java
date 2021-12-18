package io.javabrains.microservices.movieinfoservicepractise1;

public class Movie {
	
	private String movieId;
	private String status;
	private String overview;
	private String title;
	public Movie(String movieId, String status,String overview, String title) {
		this.movieId = movieId;
		this.status = status;
		this.overview=overview;
		this.title=title;
		
	}
	
	public Movie(){
		
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}

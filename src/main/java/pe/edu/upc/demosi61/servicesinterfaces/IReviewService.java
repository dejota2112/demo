package pe.edu.upc.demosi61.servicesinterfaces;

import pe.edu.upc.demosi61.entities.Review;

import java.util.List;

public interface IReviewService {
    public void insert(Review review);

    public List<Review> list();
    public List<String[]> quantityReviewByMovie();
    List<String[]> pointsByMovie();
}

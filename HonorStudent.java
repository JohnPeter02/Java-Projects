public class HonorStudent extends Student{
    private String Rank;
    private String Rating;

    HonorStudent(String Student, Person Rank, String Rating) {
        super(Rank, Student, Rating);
    }

    public void setRank(String newRank) {
        Rank = newRank;
    }

    public String getRank() {
        return Rank;
    }

    public void setRating(String newRating) {
        Rating = newRating;
    }

    public String getRating() { 
        return Rating;
    }

}

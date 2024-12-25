package Entity;

public class Ticket {
    private String movieName;
    private String showTime;
    private String seatNumber;

    public Ticket(String movieName, String showTime, String seatNumber) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.seatNumber = seatNumber;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}

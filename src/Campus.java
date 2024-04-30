import java.util.ArrayList;
public class Campus {

    private int phase;

    private String date;

    private String hour;

    private ArrayList<Test> testArrayList = new ArrayList<>();

    private Facility facility;


    public Campus(int phase, String date, String hour) {
        this.phase = phase;
        this.date = date;
        this.hour = hour;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public void addTests(Test test){
        testArrayList.add(test);

    }

    public ArrayList<Test> getTestArrayList() {
        return testArrayList;
    }
}

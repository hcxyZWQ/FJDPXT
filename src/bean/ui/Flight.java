package bean.ui;

public class Flight {
    private String id;
    private String airid;
    private String airtype;//机型
    private String startair;//出发机场
    private String endair;//到达机场
    private String starttime;//出发时间
    private int totalSeatNum;//座位总数
    private String endtime;//到达时间

    public Flight(String id, String airid, String airtype, int totalSeatNum, String startair, String endair, String starttime) {
        this.id=id;
        this.airid = airid;
        this.airtype = airtype;
        this.startair = startair;
        this.endair = endair;
        this.starttime = starttime;
        this.totalSeatNum = totalSeatNum;

    }

    public String getAirid() {
        return airid;
    }

    public void setAirid(String airid) {
        this.airid = airid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAirtype() {
        return airtype;
    }

    public void setAirtype(String airtype) {
        this.airtype = airtype;
    }

    public String getStartair() {
        return startair;
    }

    public void setStartair(String startair) {
        this.startair = startair;
    }

    public String getEndair() {
        return endair;
    }

    public void setEndair(String endair) {
        this.endair = endair;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }


    public int getTotalSeatNum() {
        return totalSeatNum;
    }

    public void setTotalSeatNum(int totalSeatNum) {
        this.totalSeatNum = totalSeatNum;
    }

    @Override
    public String toString() {
        return "Planeimformation{" +
                "id='" + id + '\'' +
                ", airid='" + airid + '\'' +
                ", airtype='" + airtype + '\'' +
                ", startair='" + startair + '\'' +
                ", endair='" + endair + '\'' +
                ", starttime='" + starttime + '\'' +
                ", totalSeatNum='" + totalSeatNum + '\''+
                '}';
    }
}

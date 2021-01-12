package bean.ui;

import sun.dc.pr.PRError;

import java.util.Date;

public class Planeimformation {
    private String id;
    private String airid;
    private String airtype;//机型
    private String startair;//出发机场
    private String endair;//到达机场
    private String starttime;//出发时间
    private String totalSeatNum;//座位总数
    private String endtime;//到达时间

    public Planeimformation(String airid, String airtype, String startair, String endair, String starttime, String totalSeatNum) {
        this.airid = airid;
        this.airtype = airtype;
        this.startair = startair;
        this.endair = endair;
        this.starttime = starttime;
        this.totalSeatNum = totalSeatNum;

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


    public String getTotalSeatNum() {
        return totalSeatNum;
    }

    public void setTotalSeatNum(String totalSeatNum) {
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

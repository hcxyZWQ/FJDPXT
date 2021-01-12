package bean.ui;

import java.util.Date;

public class Planeimformation {
    private String id;
    private String airtype;//机型
    private String startair;//出发机场
    private String endair;//到达机场
    private String starttime;//出发时间
    private String seatNo;//座位号
    private String totalSeatNum;//座位总数
    private String endtime;//到达时间

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

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getTotalSeatNum() {
        return totalSeatNum;
    }

    public void setTotalSeatNum(String totalSeatNum) {
        this.totalSeatNum = totalSeatNum;
    }
}

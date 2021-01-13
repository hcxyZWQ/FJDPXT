package Dao.SHIXIAN;

import Dao.IFlightDao;
import bean.ui.Flight;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class IFlightDaoIml implements IFlightDao {

    @Override
    public void insertFlight(Flight planeimformation) throws SQLException {
        String url= "jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,planeimformation.getId());
        pstmt.setString(2,planeimformation.getAirid());
        pstmt.setString(3,planeimformation.getAirtype());
        pstmt.setInt(4,planeimformation.getTotalSeatNum());
        pstmt.setString(5,planeimformation.getStartair());
        pstmt.setString(6,planeimformation.getEndair());
        pstmt.setString(7,planeimformation.getStarttime());


        pstmt.executeUpdate();
    }

    @Override
    public Set<Flight> getAllFlight() throws SQLException {
        Set<Flight> allFlight= new HashSet<Flight>();

        String url= "jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="SELECT * FROM flight";

        PreparedStatement pstmt=conn.prepareStatement(sql);
        ResultSet re=pstmt.executeQuery();
        while(re.next())
        {
            String id=re.getString("ID");
            String airid=re.getString("FLIGHT_ID");
            String airtype=re.getString("PLANE_TYPE");
            int totalSeatNum=re.getInt("TOTAL_SEATS_NUM");
            String startair=re.getString("DEPARTURE_AIRPORT");
            String endair=re.getString("DESTINATION_AIRPORT");
            String starttime=re.getString("DEPARTURE_TIME");

            Flight flight = new Flight(id, airid, airtype, totalSeatNum, starttime, endair, starttime);
            allFlight.add(flight);
        }
        return allFlight;
    }

    @Override
    public IFlightDao getFlightStartTime(String startTime) {
        return null;
    }

    @Override
    public IFlightDao getFlightStartair(String startair) {
        return null;
    }

    @Override
    public IFlightDao getFlightEndAir(String endair) {
        return null;
    }

    @Override
    public void updateFlight(IFlightDao Flight) {

    }
}

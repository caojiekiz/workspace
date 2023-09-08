package cn.itcast.druid;

import cn.itcast.util.JDBCDruidUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCDruidUtils.getConnection();
            String sql = "insert into account values(null,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000.13);
            pstmt.setString(3,"Savings");
            pstmt.setDate(4, Date.valueOf("2021-11-11"));
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCDruidUtils.close(pstmt,conn);
        }
    }
}

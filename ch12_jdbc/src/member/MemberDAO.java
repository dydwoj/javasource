package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    static {
        // 드라이버로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DML + Select
    // insert, delete, update : int 리턴
    // select : ~~DTO(where 절에 pk가 지정된다면) or LIST<~~DTO>(그 외에는 전부 리스트)

    // insert, update : 전달인자 ~~DTO 설정
    public int insert(MemberDTO memberDto) {
        con = getConnection();
        int result = 0;
        try {
            String sql = "insert into member(id, name, addr, email, age) ";
            sql += "values(?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setString(1, memberDto.getId());
            pstmt.setString(2, memberDto.getName());
            pstmt.setString(3, memberDto.getAddr());
            pstmt.setString(4, memberDto.getEmail());
            pstmt.setInt(5, memberDto.getAge());

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;
    }

    public int update(MemberDTO memberDto) {
        // memberDTO
        // 1. id, addr
        // 2. id, email
        con = getConnection();
        int result = 0;
        try {
            String sql = "update member ";
            if (memberDto.getAddr() != null) {
                sql += "set addr = ? ";
                sql += "where id = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDto.getAddr());
                pstmt.setString(2, memberDto.getId());
            } else {
                sql += "set email = ? ";
                sql += "where id = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDto.getEmail());
                pstmt.setString(2, memberDto.getId());
            }

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;
    }

}

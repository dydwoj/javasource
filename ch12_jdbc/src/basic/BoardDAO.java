package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    static {
        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {

        // Connection 생성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "c##java";
        String password = "12345";

        return DriverManager.getConnection(url, user, password);
    }

    public int insert(BoardDTO bDto) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "INSERT INTO BOARD(BNO, TITLE, CONTENT, WRITER) ";
            sql += "VALUES(BOARD_SEQ.NEXTVAL, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, bDto.getTitle());
            pstmt.setString(2, bDto.getContent());
            pstmt.setString(3, bDto.getWriter());

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}

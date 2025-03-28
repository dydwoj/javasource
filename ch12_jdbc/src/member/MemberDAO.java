package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
            String sql = "insert into member(no, id, name, addr, email, age) ";
            sql += "values(member_seq.nextval, ?,? ,? ,? ,?)";
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

    // delete : 전달인자 = pk 사용함
    public int delete(String id) {
        int result = 0;
        con = getConnection();
        String sql = "delete from member where id = ?";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    // 조회
    public MemberDTO getRow(String id) {
        MemberDTO memberDTO = null;
        con = getConnection();
        String sql = "select * from member where id = ?";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            // rs => DTO 옮기기
            if (rs.next()) {
                memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return memberDTO;
    }

    // 전체 조회
    public List<MemberDTO> getlist() {
        List<MemberDTO> list = new ArrayList<>();

        con = getConnection();
        String sql = "select * from member";
        try {
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            // rs => DTO 옮기기
            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
                list.add(memberDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    // select * from where name like '%홍%'
    public List<MemberDTO> getNameList(String name) {
        List<MemberDTO> list = new ArrayList<>();
        MemberDTO memberDTO = null;

        con = getConnection();
        String sql = "select * from member where name like ?";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();
            // rs => DTO 옮기기
            while (rs.next()) {
                memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
                list.add(memberDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

}

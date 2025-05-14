package ch2;

// 회원은 단 하나의 팀에 소속된다 (여기가 N)

public class TeamMember {

    private Long id;
    private String userName;
    private Team team;

    public TeamMember(Long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "TeamMember [id=" + id + ", userName=" + userName + ", team=" + team + "]";
    }

}

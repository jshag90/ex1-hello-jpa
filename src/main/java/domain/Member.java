package domain;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name="USERNAME")
    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID", insertable = false, updatable = false)
    private Team team;

    @OneToOne
    @JoinColumn(name = "LOCKER_ID")
    private Locker locker;

    public String getMemberId() {
        return memberId;
    }

    public String getUsername() {
        return username;
    }

    public Team getTeam() {
        return team;
    }

    public Locker getLocker() {
        return locker;
    }
}

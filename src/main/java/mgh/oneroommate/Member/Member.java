package mgh.oneroommate.Member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long USER_ID;

    @Column(nullable = false)
    private String USER_NM;
    private String USER_PWD;
    private String USER_EMAIL;
    private String USER_PHONE;
    private String USER_ADDRESS;

    @ColumnDefault("'user'")
    private String USER_GRANT;

    @ColumnDefault("'N'")
    private String DEL_YN;
    private Timestamp CREATE_TIME;
    private Timestamp MODIFY_TIME;

}

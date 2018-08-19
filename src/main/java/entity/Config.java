package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ray.fu on 2017/12/11.
 */
@Entity(name="CONFIG")
public class Config implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CRON")
    private String cron;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
}


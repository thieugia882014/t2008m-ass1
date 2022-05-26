package aptech.t2008mass1.Streets;


import aptech.t2008mass1.district.District;
import aptech.t2008mass1.enumOne.Enums;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name = "streets")
public class Streets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date establishDate;
    private String description;
    @Column(name = "districtId")
    private int districtId;
    @ManyToOne
    @JoinColumn(name = "districtId",insertable = false,updatable = false)
    private District district;
    private Enums status;
}

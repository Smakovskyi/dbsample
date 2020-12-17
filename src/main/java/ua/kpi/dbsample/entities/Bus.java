package ua.kpi.dbsample.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/*
id bigint NOT NULL DEFAULT nextval('bus_id_seq'::regclass),
    bus_model_id bigint NOT NULL,
    vin character varying(50) COLLATE pg_catalog."default" NOT NULL,
    registration character varying(20) COLLATE pg_catalog."default" NOT NULL,
 */
@Entity
@Getter
@Setter
public class Bus {
  @Id
  private Long id;

  @ManyToOne
  @JoinColumn(name = "bus_model_id")
  private BusModel busModel;
  private String vin;
  private String registration;
}

package uz.pdp.appgreenshop.entity;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import uz.pdp.appgreenshop.entity.abs.AbsUUID;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity
public class User extends AbsUUID {



}

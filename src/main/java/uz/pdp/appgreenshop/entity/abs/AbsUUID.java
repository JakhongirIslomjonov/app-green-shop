package uz.pdp.appgreenshop.entity.abs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class AbsUUID {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @CreationTimestamp
    private LocalDateTime signedAt;

    @CreationTimestamp
    private LocalDateTime lastUpdateAt;
}

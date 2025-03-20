package com.colizeum.cleanerapi.model;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "steam")
@Getter
@Setter
@Tag(name = "Исключения Steam")
public class Steam {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "manifest_id", unique = true, nullable = false)
    private String manifestId;
}

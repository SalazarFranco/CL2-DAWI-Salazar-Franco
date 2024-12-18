package edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class FilmCategoryId implements Serializable {
    private Integer categoryId;
    private Integer filmId;

}

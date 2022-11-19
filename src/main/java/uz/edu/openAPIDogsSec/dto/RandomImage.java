package uz.edu.openAPIDogsSec.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RandomImage implements Serializable {
    private String message;
    private String status;
}

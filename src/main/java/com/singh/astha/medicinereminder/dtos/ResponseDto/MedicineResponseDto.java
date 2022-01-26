package com.singh.astha.medicinereminder.dtos.ResponseDto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicineResponseDto {

    private Long id;
    private String name;
    private Integer currentDosage;
    private String medicineType;
}
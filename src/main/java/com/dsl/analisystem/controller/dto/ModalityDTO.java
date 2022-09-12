package com.dsl.analisystem.controller.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class ModalityDTO implements Serializable {
    private final Short idModality;
    private final String nameModality;
}

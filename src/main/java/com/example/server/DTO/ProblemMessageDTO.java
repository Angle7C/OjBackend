package com.example.server.DTO;

import lombok.Data;

@Data
public class ProbelmMessageDTO {
    private String ProblemId;
    private String levelRank;
    private String[] tags;
    private Boolean success;

}

package com.bridgelabz.lmscandidateservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Purpose : CustomException are Used to Validation exception
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomException {
    private int errorCode;
    private String message;
}
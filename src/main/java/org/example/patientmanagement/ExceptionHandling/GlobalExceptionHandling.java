package org.example.patientmanagement.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandling {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String , String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {

        Map<String,String> errorMapping= e.getBindingResult()
                .getFieldErrors()
                .stream()
                .collect(Collectors
                        .toMap(
                                fieldError -> fieldError.getField(),
                                fieldError -> fieldError.getDefaultMessage() ,
                                (error1, error2) -> error1
                        ));


        return new ResponseEntity<>(errorMapping , HttpStatus.BAD_REQUEST);


    }
//    @ExceptionHandler(InsuffiecientFund.class)
//    public ResponseEntity<String> handleInsuffientFund(InsuffiecientFund insuffiecientFund) {
//
//    }

}

package com.intercorp.evaluation.matrix.controller;

import com.intercorp.evaluation.matrix.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/matrix")
public class MatrixController {

    @Autowired
    MatrixService service;

    @PostMapping(path = "/rotate90ACW")
    public int [][] rotate90AntiClockWise(@RequestBody int [][] matrix){
        service.validate(matrix);
        service.transpose(matrix);
        service.reverseColumns(matrix);
        return matrix;
    }
}

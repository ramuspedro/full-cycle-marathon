package com.example.orderservice.controller;

import com.example.orderservice.dto.OrderDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:34213")
@RequestMapping(value = "/order")
public class OrderController {
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Void> index(@RequestBody OrderDTO data) {
        System.out.println(data.toString());
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

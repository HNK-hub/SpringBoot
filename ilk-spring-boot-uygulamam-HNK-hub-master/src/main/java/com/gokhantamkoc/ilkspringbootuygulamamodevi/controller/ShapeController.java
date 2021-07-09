package com.gokhantamkoc.ilkspringbootuygulamamodevi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gokhantamkoc.ilkspringbootuygulamamodevi.dto.ShapeDto;
import com.gokhantamkoc.ilkspringbootuygulamamodevi.service.ShapeService;

@RestController
@RequestMapping("/shapeController")
public class ShapeController {
	  @Autowired
	    private ShapeService shapeService;

	    @GetMapping("/listShape")
	    public ResponseEntity<?> listShape() {
	        List<ShapeDto> shapeDto = shapeService.listShape();
	        return ResponseEntity.ok(shapeDto);
	    }

	    @GetMapping("/getShape")
	    public ResponseEntity<?> getShape(@RequestParam int id) {
	        ShapeDto shapeDto = shapeService.getShape(id);
	        return ResponseEntity.ok(shapeDto);
	    }

	    @PostMapping("/addShape")
	    public ResponseEntity<?> addShape(@RequestBody ShapeDto shapeDto) {
	        ShapeDto addedShape = shapeService.addShape(shapeDto);
	        return ResponseEntity.ok(addedShape);
	    }

	    @PutMapping("/updateShape")
	    public ResponseEntity<?> updateShape(@RequestBody ShapeDto shapeDto) {
	        ShapeDto updatedShape = shapeService.updateShape(shapeDto);
	        return ResponseEntity.ok(updatedShape);
	    }

	    @DeleteMapping("/deleteShape")
	    public ResponseEntity<?> deleteShape(@RequestBody ShapeDto shapeDto) {
	        ShapeDto deletedShape = shapeService.deleteShape(shapeDto);
	        return ResponseEntity.ok(deletedShape);
	    } 
}

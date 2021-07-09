package com.gokhantamkoc.ilkspringbootuygulamamodevi.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokhantamkoc.ilkspringbootuygulamamodevi.dto.ShapeDto;
import com.gokhantamkoc.ilkspringbootuygulamamodevi.exceptions.ShapeNotFoundException;

@Service
public class ShapeService {
	
	@Autowired
	public static ArrayList<ShapeDto> shapes = new ArrayList<ShapeDto>();
	
	public ShapeService () {
		
	}
	
	public ArrayList<ShapeDto> listShape() {
		return shapes;
		
	}
	public ShapeDto getShape(int id) {
		for(ShapeDto shape : shapes) {
			if(shape.getId() == id) {
				return shape;	
			}
		}
		  throw new ShapeNotFoundException(id);
		  
		  
	}
	
	public ShapeDto addShape(ShapeDto shapeDto) {
		shapes.add(shapeDto);
		shapeDto.setId(shapes.size() -1);
		return shapeDto;
		
	}
	public ShapeDto updateShape(ShapeDto shapeDto) {
		int i =0;
		for(ShapeDto shape : shapes) {
			if(shape.getId() == shapeDto.getId()) {
				return shapes.remove(i);
			}
			i++;
		}
	    throw new ShapeNotFoundException(shapeDto.getId());
		
	}
	public ShapeDto deleteShape(ShapeDto shapeDto){
        int i = 0;
        for (ShapeDto shape : shapes){
            if (shape.getId() == shapeDto.getId()){
                return shapes.remove(i);
            }
            i++;
        }
        throw new ShapeNotFoundException(shapeDto.getId());
    } 
}

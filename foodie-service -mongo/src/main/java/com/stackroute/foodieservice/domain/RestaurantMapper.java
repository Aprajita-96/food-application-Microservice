package com.stackroute.foodieservice.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE= Mappers.getMapper(RestaurantMapper.class);
    @Mapping(source = "restaurantName",target = "name")
    RestaurantDto restaurantToDto(Restaurant restaurant);
}




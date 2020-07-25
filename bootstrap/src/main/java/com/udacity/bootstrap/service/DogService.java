package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;

import java.util.List;

public interface DogService {

    public List<Dog> retrieveAllDogs();

    public List<String> retrieveDogBreeds();

    public String retrieveDogBreedById(Long id);

    public List<String> retrieveDogNames();

}

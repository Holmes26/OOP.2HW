package org.example.cw.cw14.controller;

import org.example.cw.cw14.model.Dog;

import java.util.Iterator;
import java.util.List;

public class ListOfDogIterator implements Iterator<Dog> {
    private List<Dog> dogListIterator;
    private int counter;
    public ListOfDogIterator(List<Dog> dogList){
        dogListIterator = dogList;
        counter = 0;
    }
    @Override
    public boolean hasNext() {
        return counter < dogListIterator.size() - 1;
    }

    @Override
    public Dog next() {
        if(!hasNext()){
            return null;
        }
        counter++;
        return dogListIterator.get(counter-1);
    }
}

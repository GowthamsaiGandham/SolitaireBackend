package com.example.solitaire.service;


import com.example.solitaire.model.Card;
import com.example.solitaire.repository.PileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PileService implements PileRepository {
    public void addSequence(int id,int fromIndex,int toIndex){
          System.out.println("hello world");
    }
}

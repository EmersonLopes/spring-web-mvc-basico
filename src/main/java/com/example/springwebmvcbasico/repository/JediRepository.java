package com.example.springwebmvcbasico.repository;

import com.example.springwebmvcbasico.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
    private List<Jedi> list;

    public JediRepository() {
        this.list = new ArrayList<>();
        list.add(new Jedi("Luke", "Skywalker"));
    }

    public List<Jedi> listAll() {
        return list;
    }

    public void add(Jedi jedi) {
        this.list.add(jedi);
    }
}

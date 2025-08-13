package br.futurodev.jmt.semana7.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CityEntity {

    private static Long nextId = 1L;

    @Getter
    private static final List<CityEntity> CITIES = new ArrayList<>();

    @Setter(AccessLevel.PRIVATE) private Long id;
    private String name;
    private Long numberInhabitants;

    public CityEntity() {
        this.id = nextId++;   // >> Atribui valor de nextId e roda o contador       > id = 1 e nextId = 2
//        this.id = ++nextId; // >> Roda o contador e atribui o resultado do nextId > id = 2 e nextId = 2
    }

    public static CityEntity save(CityEntity city) {
        CITIES.add(city);
        return city;
    }

}

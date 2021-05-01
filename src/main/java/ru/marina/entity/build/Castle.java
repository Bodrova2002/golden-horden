package ru.marina.entity.build;

import ru.marina.entity.build.impl.Gates;
import ru.marina.entity.build.impl.Tower;
import ru.marina.entity.build.impl.Wall;

import java.util.ArrayList;
import java.util.List;

public class Castle {

    private final List<Construction> buildings;

    private Castle(List<Construction> buildings){
        this.buildings = buildings;
    }

    public static CastleBuilder createCastle(){
        return new CastleBuilder();
    }

    public static class CastleBuilder {

        private final List<Construction> buildings;

        public CastleBuilder(){
            buildings = new ArrayList<>();
        }

        public CastleBuilder addTower(){
            buildings.add(new Tower());
            return this;
        }

        public CastleBuilder addWall(){
            buildings.add(new Wall());
            return this;
        }

        public CastleBuilder addGates() {
            buildings.add(new Gates());
            return this;
        }

        public Castle build(){
            return new Castle(buildings);
        }
    }

    public List<Construction> getBuildings() {
        return buildings;
    }
}

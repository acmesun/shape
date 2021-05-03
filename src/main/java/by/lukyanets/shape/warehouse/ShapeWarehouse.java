package by.lukyanets.shape.warehouse;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShapeWarehouse {
    private static ShapeWarehouse instance;
    private Map<Integer, ShapeParam> paramMap;

    private ShapeWarehouse() {
        paramMap = new HashMap<>();
    }

    public static ShapeWarehouse getInstance() {
        if (instance == null) {
            instance = new ShapeWarehouse();
        }
        return instance;
    }

    public ShapeParam getParam(Integer key) {
        return paramMap.get(key);
    }

    public ShapeParam addParam(Integer key, Double area, Double volume){
        ShapeParam param = new ShapeParam(area, volume);
        return  paramMap.put(key, param);
    }

    public ShapeParam deleteParam(Integer key) {
        return paramMap.remove(key);
    }

    public Collection<ShapeParam> receiveParams() {
        return paramMap.values();
    }

}

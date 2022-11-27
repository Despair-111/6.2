package com.company;
import java.util.*;
    public enum Car {
        LADA("Shkoda", 190, Model.RAPID.getName(), 1000000, Color.GRAY.getName()),
        TOYOTA("Lada", 180, Model.VESTA.getName(), 1500000, Color.BLACK.getName()),
        CHEVROLET("BMW", 330, Model.X7.getName(), 850000, Color.RED.getName()),
        OPEL("Opel", 301, Model.ZAFIRA.getName(), 1250000, Color.BLUE.getName()),
        FERRARI("Ferrari,", 450, Model.ENZO.getName(), 10000000, Color.WHITE.getName());

        private String model;
        private int maxSpeed;
        private String mark;
        private final int price;
        private String colour;

        Car(String model, int maxSpeed, String mark, int price, String colour) {
            this.model = model;
            this.maxSpeed = maxSpeed;
            this.mark = mark;
            this.price = price;
            this.colour = colour;
        }

        public int getPrice() {
            return price;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public static List<Car> asList(){
            ArrayList<Car> list = new ArrayList<Car>();
            Collections.addAll(list, values());
            return list;
        }

        @Override
        public String toString() {
            return "Cars{" +
                    "model='" + model + '\'' +
                    ", maxSpeed=" + maxSpeed +
                    ", mark='" + mark + '\'' +
                    ", price=" + price +
                    ", colour='" + colour + '\'' +
                    '}';
        }
    }


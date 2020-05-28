package com.duan.design.observer.head;

import java.util.ArrayList;

/**
 * @author duanjw
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index < 0) {
            System.out.println("你还没有订阅我哦！");
        } else {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(item->{
            item.update(temp, humidity, pressure);
        });
    }

    /**
     * 气象站得到更新观测值时，通知订阅者
     */
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

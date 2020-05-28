package com.duan.design.strategy.head.behavior.quack;

/**
 * 吱吱叫
 * @author duanjw
 */
public class Squeak implements QuakcBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}

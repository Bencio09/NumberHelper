/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberhelper;


/**
 *
 * @author loreb
 */
public class NumberHelper {
    private int number;

    public NumberHelper(int number) {
        this.number = number;
    }
    
    public boolean isEven(){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
    
    public boolean isOdd(){
        if(number % 2 != 0){
            return true;
        }
        return false;

    }
    
    public int sum(int n){
        return number+n;
    }
    
    public boolean isPrime(){
        for(int i=2; i<number/2; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    
    public boolean isDivisibleBy(int n){
        if(number % n == 0){
            return true;
        }
        return false;
    }
}

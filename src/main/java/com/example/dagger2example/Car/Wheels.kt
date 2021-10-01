package com.example.dagger2example.Car

class Wheels {
    private var rims: Rims
    private var tires: Tires

    constructor(rims: Rims, tires: Tires) {
        this.rims = rims
        this.tires = tires
    }
}
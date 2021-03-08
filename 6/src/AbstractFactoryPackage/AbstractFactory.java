package AbstractFactoryPackage;

import AbstractFactoryPackage.AbstractProductA;
import AbstractFactoryPackage.AbstractProductB;

interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}




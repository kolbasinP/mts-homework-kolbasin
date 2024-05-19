package homework;

import homework.servicesImpl.CreateAnimalServiceImpl;

public class Main {

    public static void main(String[] args) {

        CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();

        //createAnimalService.createAnimal();
        //System.out.println("------------");
        createAnimalService.createAnimal(10);
        //System.out.println("------------");
        //(new CreateAnimalService() {}).createAnimal();
    }
}
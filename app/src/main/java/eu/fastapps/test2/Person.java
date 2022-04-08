package eu.fastapps.test2;

class Person{

    Person(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    String print(){
        return this.firstName + " " + this.secondName;
    }

    String firstName;
    String secondName;
}

class Student extends Person{

    Student(String _firstName, String _secondName, float _grade) {
        super(_firstName, _secondName);
        grade = _grade;
    }

    @Override
    String print(){
        return firstName + " " + secondName + " " + grade;
    }

    float grade;
}


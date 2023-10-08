package bai3;

class Student {
    private String name;
    private String classes;

    public String getClasses() {
        return classes;
    }

    public Student() {
        name = "John";
        classes = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }


    public String getName() {
        return name;
    }
}
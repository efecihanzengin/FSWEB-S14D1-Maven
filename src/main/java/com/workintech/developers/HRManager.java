package com.workintech.developers;

public class HRManager extends Employee {
    private String[] juniorDevelopers;
    private String[] midDevelopers;
    private String[] seniorDevelopers;

    // Constructor
    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        // Dizilerin boyutlarını belirlemek için her zaman bir sayı vermelisiniz.
        this.juniorDevelopers = new String[3];  // Örneğin 3 elemanlı bir dizi
        this.midDevelopers = new String[3];
        this.seniorDevelopers = new String[3];
    }

    // Override work metodu
    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }

    // Developer eklemek için metod
    public void addEmployee(int index, String developerType, String developerName) {
        // Verilen index'e göre developer türüne göre diziye ekleme yapalım
        if (developerType.equalsIgnoreCase("Junior")) {
            if (index >= 0 && index < juniorDevelopers.length) {
                juniorDevelopers[index] = developerName;
            } else {
                System.out.println("Invalid index for Junior Developer.");
            }
        } else if (developerType.equalsIgnoreCase("Mid")) {
            if (index >= 0 && index < midDevelopers.length) {
                midDevelopers[index] = developerName;
            } else {
                System.out.println("Invalid index for Mid Developer.");
            }
        } else if (developerType.equalsIgnoreCase("Senior")) {
            if (index >= 0 && index < seniorDevelopers.length) {
                seniorDevelopers[index] = developerName;
            } else {
                System.out.println("Invalid index for Senior Developer.");
            }
        } else {
            System.out.println("Invalid developer type.");
        }
    }

    // Dizileri yazdıran yardımcı metodlar (isteğe bağlı)
    public void printDevelopers() {
        System.out.println("Junior Developers: ");
        for (String developer : juniorDevelopers) {
            if (developer != null) {
                System.out.println(developer);
            }
        }

        System.out.println("Mid Developers: ");
        for (String developer : midDevelopers) {
            if (developer != null) {
                System.out.println(developer);
            }
        }

        System.out.println("Senior Developers: ");
        for (String developer : seniorDevelopers) {
            if (developer != null) {
                System.out.println(developer);
            }
        }
    }
}

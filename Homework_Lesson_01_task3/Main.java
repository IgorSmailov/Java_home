package Homework_Lesson_01_task3;

public class Main {
    public static void main(String[] args) {
Computer [] computers = new Computer[5];
computers[0] = new Computer();
computers[1] = new Computer();
computers[2] = new Computer();
computers[3] = new Computer();
computers[4] = new Computer();

//Aurora R11 Desktop - Intel Core i7 10700F - 16GB Memory - NVIDIA GeForce RTX 2080 SUPER - 1TB HDD + 512GB SSD

computers[0].setPc_brand("Aurora");
computers[0].setPc_series("Aurora R11 Desktop");
computers[0].setPc_cpu("Intel Core i7 10700F");
computers[0].setPc_memory("16GB Memory");
computers[0].setPc_hdd("1TB HDD + 512GB SS");

// ASUS - ROG Gaming Desktop - Intel Core i7-9700K - 16GB Memory - NVIDIA GeForce RTX 2080 SUPER - 2TB HDD + 512GB SSD

computers[1].setPc_brand("ASUS");
computers[1].setPc_series("ROG Gaming Desktop");
computers[1].setPc_cpu("Intel Core i7-9700K");
computers[1].setPc_memory("16GB Memory");
computers[1].setPc_hdd("2TB HDD + 512GB SSD");

//iBUYPOWER - Gaming Desktop - Intel i7-10700K - 16GB Memory - NVIDIA GeForce RTX 2080 Super 8GB - 480GB SSD + 1TB HDD
computers[2].setPc_brand("iBUYPOWER");
computers[2].setPc_series("Gaming Desktop2020");
computers[2].setPc_cpu("Intel i7-10700K");
computers[2].setPc_memory("16GB Memory ");
computers[2].setPc_hdd("480GB SSD + 1TB HDD");

//CLX - SET Gaming Desktop - Intel Core i5 9400F 2.9GHz - 16GB Memory - NVIDIA GeForce GTX 1660 SUPER 6GB - 480GB SSD + 2TB HDD - Black/RGB

computers[3].setPc_brand("CLX");
computers[3].setPc_series("SET Gaming Desktop");
computers[3].setPc_cpu("Intel Core i5 9400F 2.9GHz");
computers[3].setPc_memory("16GB Memory");
computers[3].setPc_hdd("480GB SSD + 2TB HDD");

//Skytech Gaming – Chronos Mini Gaming Desktop – AMD Ryzen 7 3700X – NVIDIA GeForce RTX3070 – 1TB NVME SSD – 16GB Memory - White

computers[4].setPc_brand("Skytech Gaming");
computers[4].setPc_series("Chronos Mini Gaming Desktop");
computers[4].setPc_cpu("AMD Ryzen 7 3700X");
computers[4].setPc_memory("16GB Memory");
computers[4].setPc_hdd("1TB NVME SSD");

//One more if need: HP OMEN - 30L Gaming Desktop - AMD Ryzen 7-Series - 3700X - 16GB Memory - NVIDIA GeForce RTX 2060 - 1TB HDD + 256GB SSD - Black

        //Start adding to loop:
        for (int i=0 ; i <computers.length; i++){
            computers[i].setPc_brand(computers[i].getPc_brand());
            computers[i].setPc_series(computers[i].getPc_series());
            computers[i].setPc_cpu(computers[i].getPc_cpu());
            computers[i].setPc_memory(computers[i].getPc_memory());
            computers[i].setPc_hdd(computers[i].getPc_hdd());

            System.out.println("Computer #" +(i+1) + " added to the system!");
            System.out.println("Configuration: " +computers[i].getPc_brand() + "+" + computers[i].getPc_series()
                    + "+" +computers[i].getPc_cpu() + "+" +computers[i].getPc_memory() + "+" +computers[i].getPc_hdd());

        }

    }
}

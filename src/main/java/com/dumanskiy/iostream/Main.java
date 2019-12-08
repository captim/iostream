package com.dumanskiy.iostream;

import com.dumanskiy.iostream.hobby.Hobby;

import java.io.*;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Hobby> hobbies = new ArrayList<Hobby>();
        for (int i = 0; i < 3; i++) {
            hobbies.add(new Hobby("Hobby" + i, i * 2, i));
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("input.dat"));
        for (int i = 0; i < 3; i++) {
            oos.writeObject(hobbies);
        }
        File copy = new File("copy");
        copy.mkdir();
        oos = new ObjectOutputStream(new FileOutputStream(copy + "\\output.dat"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("input.dat"));
        oos.writeObject(ois.readObject());
        ois = new ObjectInputStream(new FileInputStream(copy + "\\output.dat"));
        System.out.println(ois.readObject());
    }
}

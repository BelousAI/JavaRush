package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File your_file_name = File.createTempFile("MyFile", null);
            File your_file_name = new File("d://Test/MyFile.txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            User user2 = new User();
            user.setCountry(User.Country.RUSSIA);
            user2.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user);
            javaRush.users.add(user2);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));
            for (User u : loadedObject.users) {
                System.out.println(u.getFirstName());
                System.out.println(u.getLastName());
                System.out.println(u.getBirthDate());
                System.out.println(u.getCountry());
                System.out.println(u.isMale());
            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            String isUsersEmpty = users.isEmpty() ? "yes" : "no";
            printWriter.println(isUsersEmpty);
            //StringBuilder data;

            if (isUsersEmpty.equals("no")) {
                for (User u : users) {
//                    data = new StringBuilder();
//                    data.append(u.getFirstName()).append(" ")
//                            .append(u.getLastName()).append(" ")
//                            .append(u.getBirthDate() != null ? u.getBirthDate().getTime() : null).append(" ")
//                            .append(u.getCountry()).append(" ")
//                            .append(u.isMale());
//                    printWriter.println(data.toString());
                    printWriter.println(u.getFirstName());
                    printWriter.println(u.getLastName());
                    printWriter.println(u.getBirthDate() != null ? u.getBirthDate().getTime() : null);
                    printWriter.println(u.getCountry());
                    printWriter.println(u.isMale());
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isUsersEmpty = reader.readLine();
            if (isUsersEmpty.equals("no")) {
                while (reader.ready()) {
                    User user = new User();
//                    String[] arr = reader.readLine().split(" ");
//                    user.setFirstName(arr[0].equals("null") ? null : arr[0]);
//                    user.setLastName(arr[1].equals("null") ? null : arr[1]);
//                    user.setBirthDate(arr[2].equals("null") ? null : new Date(Long.parseLong(arr[2])));
//
//                    if (arr[3].equals("null")) {
//                        user.setCountry(null);
//                    } else user.setCountry(User.Country.valueOf(arr[3]));
//
//                    user.setMale(arr[4].equals("true") ? true : false);

                    String line = reader.readLine();
                    user.setFirstName(line.equals("null") ? null : line);
                    line = reader.readLine();
                    user.setLastName(line.equals("null") ? null : line);
                    line = reader.readLine();
                    user.setBirthDate(line.equals("null") ? null : new Date(Long.parseLong(line)));
                    line = reader.readLine();
                    user.setCountry(line.equals("null") ? null : User.Country.valueOf(line));
                    line = reader.readLine();
                    user.setMale(line.equals("true"));
                    users.add(user);
                }
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}

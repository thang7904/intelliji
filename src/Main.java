import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    static void ghìile(){
        try (FileWriter writer = new FileWriter("filename.txt")) {
            writer.write("Hello, World!\n");
            writer.write("This is a test.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    static void docfile(){
//        try (FileReader reader = new FileReader("filename.txt")) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                System.out.print((char) character);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    static void sapxeptheoten(List<SV> sv){
        Comparator<SV> C = new Comparator<SV>() {
            @Override
            public int compare(SV o1, SV o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(sv, C);
    }

    static void sapxeptheotuoi(List<SV> sv){
        Collections.sort(sv,Comparator.comparing(SV::getAge));
    }


    static List<SV> docfile(List<SV> svList) {
        try (FileReader reader = new FileReader("filename.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\\|"); // Split the line by '|'
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                int age = Integer.parseInt(parts[2].trim());
                SV student = new SV(id, name, age);
                svList.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return svList;
    }


    public static void main(String[] args) {
        List<SV> sv = new ArrayList();
//        sv.add(new SV(1, "A", 22));
//        sv.add(new SV(2, "", 21));
//        sv.add(new SV(3, "C", 28));
//        sv.add(new SV(4, "F", 29));
//        sv.add(new SV(5, "D", 16));
//
//        sapxeptheotuoi(sv);
//        sapxeptheoten(sv);
//
//        try (FileWriter writer = new FileWriter("filename.txt")) {
//            for (SV sv1 : sv){
//                writer.write(sv1.toString()+"\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//       docfile(sv);
//       for (SV sv1 : sv) {
//           System.out.println(sv1.toString());
//       }
         for (int i =0;i<10000;i++){
             System.out.println(i);
         }
    }
}


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {


        Iterator<Path> pathIterator = getPaths("C:\\Users\\alexandru.fodor.DESKOVER\\Documents\\UiPath\\Studio\\Studio", "fr");

        try{

            while (pathIterator.hasNext()) {
//                System.out.println("File to check: " + pathIterator.next());
//                System.out.println(Iterator.next());
//                readFiles(Iterator.next().toString());
//                System.out.println(getMapOfTranslations(Iterator.next().toString()));
                Map<String, String> dictionary = new HashMap<>(getMapOfTranslations(pathIterator.next().toString()));

                try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\alexandru.fodor.DESKOVER\\Documents\\UiPath\\Studio\\Studio\\test.csv", true), StandardCharsets.UTF_8))){
                    for(Map.Entry<String, String> entry : dictionary.entrySet()){
                        writer.write(String.join(",",  entry.getKey(), entry.getValue()));
                        writer.newLine();
                    }
                }
//            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
//                System.out.println("=====================================================");
//                System.out.println(entry.getKey() + "/" + entry.getValue());
//            }

            }

        } catch (Exception e){
            System.out.println(e);
        }

    }

    public static Iterator<Path> getPaths(String sDir, String language) {
        try {
//            Files.find(Paths.get(sDir), 9999, (p, bfa) -> bfa.isRegularFile() && p.getFileName().toString().matches(".*\\.de.resx"));
            Iterator<Path> pathIterator = Files.find(Paths.get(sDir), 9999, (p, bfa) -> bfa.isRegularFile() && p.getFileName().toString().matches(".*\\." + language + ".resx")).iterator();
            return pathIterator;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public static void readFiles(String filePath) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    filePath));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> getMapOfTranslations(String filePath) {

        Map<String, String> dictionary = new HashMap<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
//                    line.matches(("(data name\\=)([\"'])(?:(?=(\\\\?))\\3.)*?\\2"));
                //find names
                String key = "";
                if(line == null){
                    break;
                }
                if (line.matches((".*(\\s*<data name\\=.*)"))) {

//                    System.out.println("Found!!!");

                    Matcher m = Pattern.compile("([\"'])(?:(?=(\\\\?))\\2.)*?\\1")
                            .matcher(line);
                    if (m.find()) {
                        key = m.group();
                    }
                }
                else
                {
                    continue;
                }

//                    line = reader.readLine();


                    //find values

                    String value = "";
                    line = reader.readLine();
                    if (line.matches((".*(\\s*<value.*)"))) {

//                        System.out.println("Found!!!");
                        int lo = line.indexOf('>') + 1;
                        int hi = line.lastIndexOf('<');

                        if(hi > lo) {
                            value = line.substring(lo, hi);
                        }

//                        Matcher v = Pattern.compile("([\"'])(?:(?=(\\\\?))\\2.)*?\\1")
//                                .matcher(line);
//                        while (v.find()) {
//                            allValuesFound.add(v.group());
//                        }
                    }


                    dictionary.put(key.replaceAll("^\"|\"$", ""), value);
                    System.out.println(key.replaceAll("^\"|\"$", "") + "," + value);

                //System.out.println(line);
                // read next line



            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return dictionary;
    }

}





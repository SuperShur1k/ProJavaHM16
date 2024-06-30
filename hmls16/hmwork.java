package org.example.lesson16.hmls16;

import java.io.BufferedReader;
import java.io.FileReader;

public class hmwork {
    public static void main(String[] args) {
        System.out.println(countLines("test.txt"));
        System.out.println(countWordsWithPattern("test.txt", "quit"));
        System.out.println(countWords("test.txt"));
    }

    //   Напишите метод, принимающий на вход имя тек текстового файла, и воззвращающий количество строк в нем
//public static int countLines(String fileName)
    public static int countLines(String filename) {
        int count = 0;
        try (
                BufferedReader br = new BufferedReader(new FileReader(filename));
        ) {
            while (br.readLine() != null) {
                count++;
            }
        } catch (Exception e) {
//
        }
        return count;
    }

    //    Посчитайте количество строк текстового файла, содержащих определенную подстроку
//public static int countWordsWithPattern(String fileName, String pattern)
    public static int countWordsWithPattern(String fileName, String pattern) {
        int patternCount = 0;
        try (
                BufferedReader reader = new BufferedReader(new FileReader(fileName))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(pattern)) {
                    patternCount++;
                }
            }
        } catch (Exception e) {
//
        }
        return patternCount;
    }

    //    Посчитайте количество слов в текстовом файле - считается что слова отделяются пробелами
//public static int countWords(String fileName)
    public static int countWords(String fileName){
        int wordCount = 0;
        try(
              BufferedReader br = new BufferedReader(new FileReader(fileName))
                )
        {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }

        }catch (Exception e){
//
        }
        return wordCount;
    }
}

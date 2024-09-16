package org.example.e198;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationFiles {

        public static String read(String path,String key) {
            FileInputStream fis= null;
            try {
                fis = new FileInputStream(path);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Properties properties=new Properties();
            try {
                properties.load(fis);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return properties.getProperty(key);
        }





    public static void main(String[] args) {
String path=".idea/Files/Config.properties";
String browserValue=ConfigurationFiles.read(path,"Browser");
String urlValue=ConfigurationFiles.read(path,"URL");
String impWaitValue=ConfigurationFiles.read(path,"ImplicitWait");
        System.out.println("Browser: "+browserValue+" URL: "+urlValue+" Implicit Wait: "+impWaitValue);
    }

}

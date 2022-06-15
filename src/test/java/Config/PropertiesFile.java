package Config;

import StepsDef.Tests;
import java.io.*;
import java.util.Properties;

public class PropertiesFile {

    static Properties prop = new Properties();

    public static void main(String[] args) {
        getProperties();
       // setProperties();

    }

    public static void getProperties() {

        try {

            InputStream input = new FileInputStream("src/test/java/Config/config.properties");
            prop.load(input);
            String url = prop.getProperty("URL");
            System.out.println(url);
            String browser = prop.getProperty("Browser");
            String dobday = prop.getProperty("dobday");
            String dobmonth = prop.getProperty("dobmonth");
            String dobyear = prop.getProperty("dobyear");

            Tests.browserName=browser;
            Tests.urlname=url;
            Tests.dobdaynumber = dobday;
            Tests.dobmonthnumber=dobmonth;
            Tests.dobyearnumber = dobyear;

        } catch (Exception exp) {
            exp.printStackTrace();
            exp.getCause();
            exp.getMessage();
        }
    }
}
  /*  public static void setProperties(){
        try {

            OutputStream output = new FileOutputStream("src/test/java/Config/config.properties");
            prop.setProperty("URL","www.google.com");
            prop.store(output,null);
        }
        catch (Exception exp){
            exp.getMessage();
            exp.printStackTrace();
            exp.getCause();

        }

    }

   */

package Intro;

public class StringFunctions {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Concatenation : " + str1 + str2);
        /*
        clear the url
        Print the length
        Find the http type?
        Find the website name
        Find the country code
        Find the city

Takeaway
        Create a new url with new City - Ajax

         */

        //https:// websitename /countryCode / type / provCode/ cityCode
        //Classname objectName
        String url ="  @@@ https://www.theweathernetwork.com/ca/weather/ontario/toronto        ";
        //objectName.methods();
        int length = url.length();
        System.out.println(length);
        url = url.replace("@","");
        System.out.println(url);

        url = url.trim();
        System.out.println(url);

        if(url.startsWith("http")){
            System.out.println("HTTP");
        }
        else if(url.startsWith("https")){
            System.out.println("HTTPS");
        }

        if(url.contains("https")) {
            System.out.println("HTTPS");
        }
        else if(url.contains("http")){
            System.out.println("HTTP");
        }

        int indexOfColon = url.indexOf(":");

        System.out.println(indexOfColon);

        System.out.println(url.substring(0,indexOfColon));

        if(url.substring(0,indexOfColon).equals("http")) {
            System.out.println("Output: HTTP");
        }
        else if(url.substring(0,indexOfColon).equals("https")){
            System.out.println("Output: HTTPS");
        }
        url ="www.theweathernetwork.com/ca/weather/ontario/toronto";

        String[] segment = url.split("/");
        System.out.println("Site name: " + segment[0]);
        System.out.println("Country code: " + segment[1]);
        System.out.println("City name: " + segment[4]);

        //Convert the String [] into String

    }
}

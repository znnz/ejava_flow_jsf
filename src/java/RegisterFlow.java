
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.PostConstruct;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zinnn
 */
@FlowScoped("register")
@Named
public class RegisterFlow implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    private HashMap countryCities=new HashMap();
    
    private String name;
    private String email;
    private String age;
    private String country;
    private String city;
    
    @PostConstruct
    private void init() {
	System.out.println(">>> creating flow");
        ArrayList<String> myanmarCities=new ArrayList<String>();
        myanmarCities.add("Yandon");
        myanmarCities.add("Manda");
        
        ArrayList<String> singaporeCities=new ArrayList<String>();
        singaporeCities.add("West");
        singaporeCities.add("East");
        
        ArrayList<String> indiaCities=new ArrayList<String>();
        indiaCities.add("Mumbia");
        indiaCities.add("Kolkata");
        indiaCities.add("Jamu");
        indiaCities.add("Kashmi");
        
        
        countryCities.put("Myanmar",myanmarCities);
        countryCities.put("Singapore",singaporeCities);
        countryCities.put("India",indiaCities);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public List<String> getCountries(){
        ArrayList<String> countries =new ArrayList<String>(countryCities.keySet());
        return countries;
    }
    
    public List<String> getCities(){
        ArrayList<String> cities =new ArrayList<String>();
        cities=(ArrayList<String>) countryCities.get(country);
        return cities;
    }
    
    public String processFlow(){
        return ("register-return");
    }
    
}

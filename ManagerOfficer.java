
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hello VIỆT
 */
public class ManagerOfficer {
      List<Officer> officers;
    
    public ManagerOfficer(){
        this.officers = new ArrayList<>();
    }
    
    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }
    
    public List<Officer> searchOfficerByName(String name) {
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    
    public void showListInfoOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}

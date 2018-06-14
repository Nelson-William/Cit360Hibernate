/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatetest;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author willnelson
 */
@Named(value = "carController")
@SessionScoped
public class CarController implements Serializable {

    /**
     * Creates a new instance of CarController
     */
    public CarController() {
    }
    
}

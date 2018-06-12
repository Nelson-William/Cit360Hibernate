/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatetest;

import org.hibernate.Session;

/**
 *
 * @author willnelson
 */
public class CarHelper {
    
    Session session = null;
    
    public CarHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
}
